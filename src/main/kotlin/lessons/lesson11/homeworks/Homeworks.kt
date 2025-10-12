package lessons.lesson11.homeworks

fun main() {
    task1()
}
//Задачи на сигнатуру метода
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции,
// список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

//Не принимает аргументов и не возвращает значения.
fun task1() {
    println("Не принимает аргументов и не возвращает значения.")
}

//Принимает два целых числа и возвращает их сумму.
fun task2(number1: Int, number2: Int) = number1 + number2

//Принимает строку и ничего не возвращает.
fun task3(value: String) {

}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun task4(list: List<Int>): Double {
    var sum: Int = 0
    for (i in list) {
        sum = +i
    }
    val result = sum / list.size
    return result.toDouble()
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun task5(value: String?): Int {
    return value?.length ?: 0
}

//Не принимает аргументов и возвращает nullable вещественное число.
fun task6(): Double? {
    return null
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun task7(value: List<Int>?) {

}

//Принимает целое число и возвращает nullable строку.
private fun task8(value: Int): String? {
    return null
}

//Не принимает аргументов и возвращает список nullable строк.
private fun task9(): String? {
    return null
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun task10(value: String?): Boolean? {
    return null
}