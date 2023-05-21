package at.yeoman.examples.kotlin.swing.stacks

import at.yeoman.examples.kotlin.swing.ViewControl
import java.awt.GridLayout
import javax.swing.JComponent
import javax.swing.JPanel

class HStack() : ViewControl {
    override val view = JPanel()
    val layout = GridLayout(1, 0)

    init {
        view.layout = layout
    }

    fun add(subView: JComponent): HStack {
        ++ layout.rows
        subView.add(subView)
        return this
    }
}
