package at.yeoman.examples.kotlin.swing.sokoban;

import at.yeoman.examples.kotlin.swing.ViewControl
import at.yeoman.examples.kotlin.swing.buttons.NamedButton
import at.yeoman.examples.kotlin.swing.stacks.VStack
import java.lang.IllegalStateException
import javax.swing.JComponent

class Toggles(list: List<String>) : ViewControl {
    private var list: List<String>
    private val stack = VStack()
    private val buttonForName = mutableMapOf<String, NamedButton>()
    override val view: JComponent = stack.view

    init {
        this.list = list.toMutableList()
        buildView()
    }

    fun setList(list: List<String>) {
        this.list = list.toMutableList()
        stack.clear()
        buttonForName.clear()
        buildView()
    }

    private fun buildView() {
        list.forEach { name ->
            val button = NamedButton(name)
            if (buttonForName.putIfAbsent(name, button) != null) {
                throw IllegalStateException("Name already present [$name]")
            }
            stack.add(button)
        }
    }

    fun onClick(name: String, action: () -> Unit): ViewControl {
        buttonForName[name]?.onClick(action)
        return this
    }
}
