package lessons.lesson16.homeworks16

import com.sun.source.doctree.InheritDocTree
import kotlin.math.max

//перегрузка (изменение списка переменных в методе) и переопределение
//1
open class Animal() {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog() : Animal() {
    override fun makeSound() {
        println("Bark")
    }
}

class Cat() : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

class Bird() : Animal() {
    override fun makeSound() {
        println("Tweet")
    }
}

//2
abstract class Figure() {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Figure() {
    override fun area(): Double {
        return 3.14 * (radius * radius)
    }
}

class Square(val length: Double, val width: Double) : Figure() {
    override fun area(): Double {
        return length*width
    }
}

class Triangle(length: Double, width: Double, val angle: Double) : Figure() {
    override fun area(): Double {
        return 0.0
    }
}

//3
abstract class Printer() {
    abstract fun print(stroke: String)
}

class Lazer : Printer() {
    override fun print(stroke: String) {
        println("чёрными буквами на белом фоне " + stroke.split(" "))
    }

}

class Struiniy : Printer() {
    override fun print(stroke: String) {
        println("цветными буквами на цветном фоне " + stroke.split(" "))
    }
}

//4

class Basket() {
    var basket = 0

    fun addToCart(itemId: String) {
        basket += 1
    }

    fun addToCart(itemId: String, amount: Int) {
        basket = basket + amount
    }

    fun addToCart(itemId: String, map: Map<String, Int>) {

    }
class Triangle(length: Double, width: Double) : Figure() {

    fun addToCart(list: List<String>) {

    }
}

class Logger() {
    fun log(message: String) {
        println("$message + INFO")
    }

    fun log(message: String, level: Int) {
        println("$message + WARNING")

    }
}


fun main() {
    val dog = Dog()
    val cat = Cat()
    val bird = Bird()
    val animals = arrayOf(dog, cat, bird)
    for (animal in animals) {
        animal.makeSound()
    }

    val figures = arrayOf(Circle(2.0), Square(2.0, 2.0), Triangle(3.0, 3.0, 45.0))
    for (figure in figures) {
        println("figure ${figure.area()}")
    }

    val words = arrayOf("черный", "белый", "красный")
    val lazer = Lazer()
    val struiniy = Struiniy()
    for (word in words) {
        println("word ${lazer.print(word)}")
        println("word ${struiniy.print(word)}")

    }
}

}


