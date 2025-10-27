package lessons.lesson15.homeworks

import kotlin.math.max

open class Shape() {}
class Circle : Shape() {}
open class Geometric : Shape() {}
class Quadrangle : Geometric() {}
class Triangle : Geometric() {}

open class Education()
open class School : Education() {}
class EngineerSchool : School() {}


open class Furniture() {}
open class SoftFurniture() : Furniture() {}
class Chair : SoftFurniture() {}

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class FirstMaterial() : Materials() {

    fun insert(item: String) {
        println("firstMaterial " + item)

        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }

    }
}
//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть.
// То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.?
class SecondMaterial() : Materials() {
    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}

fun main() {
    val firstMaterial = FirstMaterial()
    firstMaterial.insert("hi")
    val secondMaterial = SecondMaterial()
    secondMaterial.insert(listOf("op","ha"))
}
