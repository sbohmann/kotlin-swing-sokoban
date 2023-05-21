package at.yeoman.examples.kotlin.swing

import java.awt.BorderLayout
import javax.swing.JFrame

class Window {
    val jframe = JFrame()

    init {
        jframe.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
    }

    fun add(control: ViewControl) {
        jframe.contentPane.add(control.view, BorderLayout.CENTER)
    }

    fun show() {
        jframe.pack()
        jframe.isVisible = true
    }

    fun hide() {
        jframe.isVisible = false
    }
}
