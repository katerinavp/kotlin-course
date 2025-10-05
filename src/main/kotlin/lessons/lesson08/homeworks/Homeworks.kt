package lessons.lesson08.homeworks

fun main() {
    task1("Это невозможно выполнить за один день")
    task1("Я не уверен в успехе этого проекта")
    task1("Произошла катастрофа на сервере")
    task1("Этот код работает без проблем")
    task1("Удача")
    task2("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    task3("4539 1488 0343 6467")
    task4("username@example.com")
    task5("C:/Пользователи/Документы/report.txt")
    task6("Котлин лучший язык программирования")
}

//
fun task1(value: String) {
    if (value.contains("невозможно")) {
        value.replace("невозможно", "совершенно точно возможно, просто требует времени")
        println(value)
    } else if (value.startsWith("Я не уверен")) {
        println(value + ", но моя интуиция говорит об обратном")
    } else if (value.contains("катастрофа")) {
        println(value.replace("катастрофа", "интересное событие"))
    } else if (value.endsWith("без проблем")) {
        println(value.replace("без проблем", "с парой интересных вызовов на пути"))
    } else if (value.split(" ").size == 1) {
        println("Иногда " + value + ", но не всегда")
    }
}

fun task2(value: String) {
    val date = value.split("->")
    val dateSeparate = date[1].split(" ")
    val day = dateSeparate[1].reversed()
    val time = dateSeparate[2]
    println("Дата " + day + ", время " + time)
}

fun task3(value: String) {
    val valueMask = value.substring(value.length - 4)
    println("*** *** *** " + valueMask)
}

fun task4(value: String) {
    val newValue = value.replace("@", "[at]").replace(".", "[dot]")
    println(newValue)
}

fun task5(value: String) {
    val result = value.split("/")
    println("название файла с расширением " + result[result.size - 1])

}

fun task6(value: String) {
    val valueList = value.split(" ")
    var result = ""
    for (element in valueList) {
        result +=element.first().uppercase()
    }
    println(result)
}
