package at.yeoman.examples.kotlin.swing.sokoban

import at.yeoman.examples.kotlin.swing.ViewControlWrapper
import at.yeoman.examples.kotlin.swing.Window
import at.yeoman.examples.kotlin.swing.buttons.Button
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

fun run() {
    val names = mutableListOf("A", "B", "C")
    val window = Window()
    val toggles = Toggles(names)
    window.add(
        toggles
            .onClick("A") {
                names[1] = "X"
                toggles.setList(names)
            })
    window.show()
}
