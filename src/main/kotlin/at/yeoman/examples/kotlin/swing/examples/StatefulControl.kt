package at.yeoman.examples.kotlin.swing.examples

import at.yeoman.examples.kotlin.swing.ViewControl
import at.yeoman.examples.kotlin.swing.ViewControlWrapper
import at.yeoman.examples.kotlin.swing.stacks.VStack
import javax.swing.JComponent
import javax.swing.JLabel

class StatefulControl : ViewControl {
    override val view: JComponent

    init {
        view = build().view
    }

    private fun build(): VStack {
        return VStack()
            .add(ViewControlWrapper(JLabel("label text")))
    }
}
