package lessons.lesson07.homeworks

import kotlin.math.cbrt

class Homework

fun main() {
//    for(i in 1..10 step 2){ // с шагом 2
//    println("result "+ i)
//    }
//    for(i in 1 until 10){ //не вкл 10
//        println(i)
//    }
//
//    var counter = 0
//    while (counter++ <10){ // 10 распечатывается
//        println(counter)
//    }

    //break
    //continue

    homework()
}


private fun homework() {
    //Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 2..10 step 2) {
        println(i)
    }
    //Создайте цикл for, который выводит числа от 5 до 1.
    var counter = 5

    while (counter >= 1) {
        println(counter)
        counter--
    }
    // Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in (1..20) step 3) {
        println(i)
    }

    //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 15
    for (i in 3 until size) {
        println(i)
    }

    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var number = 10
    while (number >= 5) {
        println("$number number")
        number--
    }

    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var num = 5
    do {
        println("$num num")
        num--
    } while (num >= 1)

    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var startNum = 5
    do {
        println("$startNum startNum")
        startNum++
    } while (startNum <= 10)

    //Задания для прерывания и пропуска итерации
    //Использование break

    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) {
            break
        } else {
            println("$i until i == 6")
        }
    }

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var numUntil10 = 1
    while (true)
        if (numUntil10 >= 10) {
            break
        } else {
            println("$numUntil10 until numUntil10 => 10")
            numUntil10++

        }

    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) {
            println("$i until 10 and четное")
            continue

        }
    }


    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    for (i in 1..10) {
        if (i % 3 != 0) {
            println("$i until 10 and крытные 3 не входят")
            continue

        }
    }


}