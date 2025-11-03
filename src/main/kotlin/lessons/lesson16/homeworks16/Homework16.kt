package lessons.lesson16.homeworks16

import com.sun.source.doctree.InheritDocTree
import kotlin.math.max

//перегрузка (изменение списка переменных в методе) и переопределение

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

class Triangle(length: Double, width: Double) : Figure() {

}


fun main() {
    val dog = Dog()
    val cat = Cat()
    val bird = Bird()
    val animals = arrayOf(dog, cat, bird)
    for (animal in animals) {
        animal.makeSound()
    }
}


