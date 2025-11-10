package lessons.lesson18.homeworks.homeworks

abstract class WashingMachine(
    override val maxTemperature: Int,
    override val sensorType: String,
    override val maxSensoredValue: Int
) : Powerable, Openable, TemperatureRegulatable, AutomaticShutdown, Drainable {
    override fun powerOn() {
        print("WashingMachine powerOn")
    }

    override fun powerOff() {
        print("WashingMachine выключен")
    }

    override fun open() {
        print("WashingMachine открыт")
    }

    override fun close() {
        print("WashingMachine закрыт")
    }

    override fun setTemperature(temp: Int) {
        print("WashingMachine установелна температура")
    }

    override fun startMonitoring() {
        print("WashingMachine старт монитор")
    }

    override fun connectToDrain() {
        print("WashingMachine  connectToDrain")
    }

    override fun drain() {
        print("WashingMachine  сушка")
    }
}