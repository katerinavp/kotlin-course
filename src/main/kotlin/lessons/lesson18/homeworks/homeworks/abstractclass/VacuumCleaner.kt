package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.Movable
import lessons.lesson18.homeworks.homeworks.`interface`.Powerable
import lessons.lesson18.homeworks.homeworks.`interface`.Programmable
import lessons.lesson18.homeworks.homeworks.`interface`.Rechargeable

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