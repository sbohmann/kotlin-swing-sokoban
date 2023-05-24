package at.yeoman.examples.kotlin.swing.stacks

import at.yeoman.examples.kotlin.swing.ViewControl
import java.awt.GridLayout
import javax.swing.JComponent
import javax.swing.JPanel

class HStack() : ViewControl {
    override val view = JPanel()
    private val layout = GridLayout(1, 0)

    init {
        view.layout = layout
    }

    fun add(control: ViewControl): HStack {
        view.add(control.view)
        return this
    }
}
