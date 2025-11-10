package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.Mechanical
import lessons.lesson18.homeworks.homeworks.`interface`.Timable

abstract class Watch: Mechanical, Timable {
    override fun performMechanicalAction() {
        TODO("Not yet implemented")
    }

    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }
}