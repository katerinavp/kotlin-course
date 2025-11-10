package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.Openable
import lessons.lesson18.homeworks.homeworks.`interface`.Powerable
import lessons.lesson18.homeworks.homeworks.`interface`.TemperatureRegulatable

abstract class Fridge : Powerable, Openable, TemperatureRegulatable {

    override fun powerOn() {}
    override fun powerOff() {}
}