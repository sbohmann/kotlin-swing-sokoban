package at.yeoman.examples.kotlin.swing

import javax.swing.JLabel

class Label(text: String) : ViewControl {
    override val view = JLabel(text)

    fun centered(): ViewControl {
        view.horizontalAlignment = JLabel.CENTER
        return this
    }
}
