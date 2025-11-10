package lessons.lesson18.homeworks.homeworks

class CoffeeMachine550PO : CoffeeMachine() {
    override val maxTemperature: Int
        get() = super.maxTemperature

    override val sensorType: String
        get() = super.sensorType

    override val maxSensoredValue: Int
        get() = super.maxSensoredValue

    override fun open() {
        println(" CoffeeMachineNew открыта")
    }

    override fun close() {
        println(" CoffeeMachineNew закрыта")
    }
}