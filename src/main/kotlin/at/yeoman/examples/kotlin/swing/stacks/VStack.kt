package at.yeoman.examples.kotlin.swing.stacks

import at.yeoman.examples.kotlin.swing.ViewControl
import java.awt.GridLayout
import javax.swing.JPanel

class VStack() : ViewControl {
    override val view = JPanel()
    private val layout = GridLayout(0, 1)

    init {
        view.layout = layout
    }

    fun add(control: ViewControl): VStack {
        view.add(control.view)
        return this
    }
}
