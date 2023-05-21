package at.yeoman.examples.kotlin.swing.sokoban

import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    runApplication(::run)
}

fun runApplication(application: () -> Unit) {
    SwingUtilities.invokeAndWait(application)
}

fun run() {
    val window = JFrame()

}
