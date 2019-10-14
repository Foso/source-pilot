![](extras/graphics/banner.png)

# source-pilot 🚧

A chrome extension to enable IDE like file navigation in GitHub

## Demo

![](demo.gif)

## Project Status

🚧 This project is under active development. The release may contain bugs or unexpected behavior. 
Feel free to open issues and create PRs

## Install

### Chrome

- Step 1 : Download `CRX` file from [releases](https://github.com/theapache64/source-pilot/releases/latest)
- Step 2 : Open [extensions tab](chrome://extensions)
- Step 3 : Drag-and-drop `CRX` file to [extensions tab](chrome://extensions)

### Firefox

- Coming Soon

## Supported Languages

- [x] Android/Kotlin
- [x] Android/Java
- [x] Android/XML
- [ ] Java (JVM Projects)
- [ ] Kotlin (JVM Projects)
- [ ] JavaScript
- [ ] Swift
- [ ] Python
- [ ] PHP

### Supported Features

- Android/Kotlin

| Feature                                 | Kotlin | Java  |
|:----------------------------------------|:-------|:------|
| Class name navigation                   | ✔️      | ✔️    |
| `R.layout` navigation                   | ✔️     | ✔️    |
| `R.string` navigation                   | ✔️     | ✔️    |
| `R.menu` navigation                     | ✔️     | ✔️    |
| `import` statement class navigation     | ✔️     | ✔️    |
| `import` statement directory navigation | ✔️     | ✔️    |
| In-class variable navigation            | ✔️     | ✔️    |
| In-class method navigation              | ✔️     | ✔️    |
| External-class method navigation        | ✔️     | 🚧    |
| Static/Object method navigation         | 🚧️     | 🚧    |

- Android/XML

| Feature                | Status |
|:-----------------------|:-------|
| Class name navigation  | ✔️     |
| `@style` navigation    | ✔️     |
| `@string` navigation   | ✔️     |
| `@color` navigation    | ✔️     |
| `@dimen` navigation    | ✔️     |
| `@drawable` navigation | ✔️     |
| `@layout` navigation   | ✔️     |

## Contribution

This project is entirely built on top of pure Kotlin JS. Feel free to create PRs

## Credits

- Logo : [GoodWare](https://www.flaticon.com/authors/good-ware)

## Author
theapache64 
