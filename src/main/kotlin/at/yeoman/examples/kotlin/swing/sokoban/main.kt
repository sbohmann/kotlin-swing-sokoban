package at.yeoman.examples.kotlin.swing.sokoban

import at.yeoman.examples.kotlin.swing.ViewControlWrapper
import at.yeoman.examples.kotlin.swing.Window
import at.yeoman.examples.kotlin.swing.stacks.VStack
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    runApplication(::run)
}

fun runApplication(application: () -> Unit) {
    SwingUtilities.invokeAndWait(application)
}

fun run() {
    val window = Window()
    window.add(VStack()
        .add(ViewControlWrapper(JButton("Hi!")))
        .add(ViewControlWrapper(JButton("Hi!")))
        .add(ViewControlWrapper(JButton("Hi!"))))
    window.show()
}
