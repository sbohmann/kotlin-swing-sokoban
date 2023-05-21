package at.yeoman.examples.kotlin.swing

import javax.swing.JComponent

class ViewControlWrapper<View: JComponent>(override val view: View) : ViewControl {
}
