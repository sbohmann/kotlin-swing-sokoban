package at.yeoman.examples.kotlin.swing.stacks

import at.yeoman.examples.kotlin.swing.ViewControl
import java.awt.GridLayout
import javax.swing.JComponent
import javax.swing.JPanel

class VStack() : ViewControl {
    override val view = JPanel()
    val layout = GridLayout(0, 1)

    init {
        view.layout = layout
    }

    fun add(subView: JComponent): VStack {
        ++ layout.rows
        subView.add(subView)
        return this
    }
}
