package lessons.lesson18.homeworks.homeworks

import lessons.lesson18.homeworks.homeworks.abstractclass.Fridge

class FridgeNoFrost: Fridge() {
    override val maxTemperature: Int
        get() = 50

    override fun setTemperature(temp: Int) {
       println(" FridgeNoFrost  установлена температура $temp")
    }

    override fun open() {
        println("  FridgeNoFrostw открыта")
    }

    override fun close() {
        println("  FridgeNoFrost закрыта")
    }
}