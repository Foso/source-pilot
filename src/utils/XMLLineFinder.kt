package utils

import org.w3c.xhr.XMLHttpRequest

object XMLLineFinder {

    /**
     * To get line number
     */
    fun getLineNumber(fileUrl: String, valueName: String, callback: (Int) -> Unit) {
        val rawUrl = fileUrl.replace("https://github.com", "https://raw.githubusercontent.com").replaceFirst("/blob", "")
        val xhr = XMLHttpRequest()
        xhr.open("GET", rawUrl)
        xhr.onreadystatechange = {
            if (xhr.readyState.toInt() == 4 && xhr.status.toInt() == 200) {
                val lineNumber = getLineNumber(xhr.responseText, valueName)
                callback(lineNumber)
            }
        };
        xhr.send()
    }

    private fun getLineNumber(fileData: String, value: String): Int {
        println("Searching for $value")
        val lines = fileData.split("\n")
        lines.forEachIndexed { index, line ->
            if (line.contains("\"$value\"")) {
                return index + 1
            }
        }
        return -1
    }
}