package lessons.lesson14.homeworks

//Методы:
//
//Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места недостаточно.
//Проверка наличия предмета (containsItem):
//Принимает название предмета
//Возвращает true если такой предмет есть
//Получение списка предметов (getItems):
//Возвращает неизменяемый список предметов
class Shelve(val capacity: Int) {
    var books = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        val space = books.sumOf { it.length }
        if (name.length + space < capacity) {
            return books.add(name)
        } else {
            return false
        }
    }

    fun removeItem(name: String): Boolean {
        return books.remove(name)
    }

//    Проверка Вместимости (canAccommodate):
//    Принимает название предмета.
//    Определяет, вместится ли предмет на полку.
//    Возвращает true, если предмет вместится, и false, если места недостаточно.

    fun canAccommodate(name: String): Boolean {
        val space = books.sumOf { it.length }
        return name.length + space <= capacity
    }

    fun containsItem(name: String): Boolean {
        return books.contains(name)
    }

    fun getItems(): List<String> {
        return books.toList()
    }
}