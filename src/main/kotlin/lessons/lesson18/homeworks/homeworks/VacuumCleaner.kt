package lessons.lesson18.homeworks.homeworks

abstract class VacuumCleaner : Powerable, Programmable, Rechargeable, Movable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        print("VacuumCleaner programAction")
    }

    override fun execute() {
        print("VacuumCleaner  execute")
    }

    override fun getChargeLevel(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }

    override fun move(direction: String, distance: Int) {
        TODO("Not yet implemented")
    }
}