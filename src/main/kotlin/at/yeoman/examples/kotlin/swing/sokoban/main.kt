package at.yeoman.examples.kotlin.swing.sokoban

import at.yeoman.examples.kotlin.swing.ViewControlWrapper
import at.yeoman.examples.kotlin.swing.Window
import at.yeoman.examples.kotlin.swing.buttons.Button
import at.yeoman.examples.kotlin.swing.buttons.NamedButton
import at.yeoman.examples.kotlin.swing.stacks.VStack
import java.awt.EventQueue
import javax.swing.JButton
import javax.swing.LookAndFeel
import javax.swing.SwingUtilities
import javax.swing.UIManager

fun main() {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    EventQueue.invokeAndWait(::run)
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
