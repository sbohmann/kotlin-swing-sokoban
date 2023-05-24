package at.yeoman.examples.kotlin.swing.sokoban

import at.yeoman.examples.kotlin.swing.ViewControlWrapper
import at.yeoman.examples.kotlin.swing.Window
import at.yeoman.examples.kotlin.swing.buttons.NamedButton
import at.yeoman.examples.kotlin.swing.stacks.VStack
import javax.swing.JButton
import javax.swing.SwingUtilities

fun main() {
    runApplication(::run)
}

fun runApplication(application: () -> Unit) {
    SwingUtilities.invokeAndWait(application)
}

class Names(
    var a: String = "A",
    var b: String = "B",
    var c: String = "C")

fun run() {
    val names = Names()
    val window = Window()
    window
        .add(mainView(names))
        .show()
}

private fun mainView(names: Names) = VStack()
    .add(ViewControlWrapper(JButton(names.a)))
    .add(NamedButton(names.b))
    .add(NamedButton(names.c))
