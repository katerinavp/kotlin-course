package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.AutomaticShutdown
import lessons.lesson18.homeworks.homeworks.`interface`.Openable
import lessons.lesson18.homeworks.homeworks.`interface`.Programmable
import lessons.lesson18.homeworks.homeworks.`interface`.TemperatureRegulatable

abstract class CoffeeMachine : AutomaticShutdown, Programmable, TemperatureRegulatable, Openable {
    override val sensorType: String
        get() = "sensorType"
    override val maxSensoredValue: Int
        get() = 40

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        print("CoffeeMachine  programActio")
    }

    override fun execute() {
        print("CoffeeMachine  execute")
    }

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun open() {
        println(" CoffeeMachin открыта")
    }

    override fun close() {
       println("CoffeeMachine закрыта")
    }
}