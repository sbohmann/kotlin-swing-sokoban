package at.yeoman.examples.kotlin.swing.buttons

import at.yeoman.examples.kotlin.swing.Label
import at.yeoman.examples.kotlin.swing.ViewControl
import at.yeoman.examples.kotlin.swing.stacks.HStack

class NamedButton(text: String) : ViewControl {
    private val button = Button("")
    private val stack =
        HStack()
            .add(Label(text).centered())
            .add(button)
    override val view = stack.view

    fun onClick(action: () -> Unit) {
        button.onClick(action)
    }
}
