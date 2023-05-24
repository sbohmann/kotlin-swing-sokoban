package at.yeoman.examples.kotlin.swing.buttons

import at.yeoman.examples.kotlin.swing.ViewControl
import javax.swing.JButton

class Button(text: String) : ViewControl {
    override val view = JButton(text)
}
