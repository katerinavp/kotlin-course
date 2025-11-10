package lessons.lesson17.homeworks

import lessons.lesson05.homeworks.cost

class SlotMachine(val name: String, val model: String, val color: String, var pinCode: String = "0000") {

    private var isTurnOn: Boolean = false
    private var isOs: Boolean = false
    private val gameList: List<String> = mutableListOf("game1", "game2", "game3")
    val isJoystick: Boolean = true
    private var balance: Double = 0.0
    private var owner: String = ""
    var supportNumberPhone = "+7(9999)999-99-99"
        private set

    private var isSessionPay: Boolean = false
    var costSession = 10.0
        private set //можно читать извне, но изменять — только внутри класса


    fun turnOn() {
        if (isTurnOn) {
            println("Включен автомат")
        } else {
            println("Выключен автомат")
        }
    }

    fun turnOff() {
        uploadOS()
        isTurnOn = false
        print("Выключен автомат")
    }

    fun uploadOS() {
        isOs = true
        print("Загружен ОС")
    }

    fun finishWorkOs() {
        isOs = false
        print("Finish ОС")
    }

    fun showGames(games: List<String>) {
        println("Show games ${gameList.toList()}")
    }

    fun turnOnGame() {
        if (isSessionPay) {
            println("Старт игры")
            isSessionPay = false
        } else {
            println("Оплатите игру")

        }
    }

    fun paySessionGame(costSession: Double): Boolean {
        if (this.costSession >= costSession) {
            balance += costSession
            isSessionPay = true
            return true
        } else {
            isSessionPay = false
            return false
        }
    }

    fun takeCashByPinCode(pinCode: String): Double {
        return if (this.pinCode == pinCode) {
            openSafeAndGiveCash()
        } else {
            println("Некорректный пин код")
            0.0
        }
    }

    private fun openSafeAndGiveCash(): Double {
        val cash = balance
        balance = 0.0
        return cash

    }

}