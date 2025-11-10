package lessons.lesson18.homeworks.homeworks

import lessons.lesson18.homeworks.homeworks.abstractclass.WashingMachine

class WashingMashineBosh(maxTemperature: Int, sensorType: String, maxSensoredValue: Int) :
    WashingMachine(maxTemperature, sensorType, maxSensoredValue) {
    override val maxTemperature: Int
        get() = 60

    override fun setTemperature(temp: Int) {
        println(" WashingMashineBosh  установлена температура $temp")
    }

    override fun open() {
    println("WashingMashineBosh open")
    }

    override fun close() {
        println("WashingMashineBosh close")
    }

}