package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.LightEmitting
import lessons.lesson18.homeworks.homeworks.`interface`.Timable

abstract class SmartWatch : LightEmitting, Timable {
    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }
}