package lessons.lesson12.homeworks

fun main() {
    val list: List<Int> = mutableListOf(1, 5, 3, 0, 10, 6, 16)
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val listString = listOf(
        "Стол",
        "табурет",
        "ваза",
        "Кружка",
        "Зеркало",
        "ковер",
        "Шкаф",
        "часы",
        "Люстра",
        "подушка",
        "Картина",
        "столик",
        "Вазон",
        "шторы",
        "Пуф",
        "книга",
        "Фоторамка",
        "светильник",
        "Коврик",
        "вешалка",
        "Подставка",
        "телевизор",
        "Комод",
        "полка",
        "Абажур",
        "диван",
        "Кресло",
        "занавеска",
        "Бра",
        "пепельница",
        "Глобус",
        "статуэтка",
        "Поднос",
        "фигурка",
        "Ключница",
        "плед",
        "Тумба",
        "игрушка",
        "Настенные часы",
        "подсвечник",
        "Журнальный столик",
        "сувенир",
        "Корзина для белья",
        "посуда",
        "Настольная лампа",
        "торшер",
        "Этажерка"
    )
    task1(list)
    task2()
    println("taskEmpty " + taskEmpty(list))
    println("taskShort " + taskShort(list))
    println("taskStart " + taskStart(mutableListOf(0, 5, 3, 0, 10, 6, 16)))
    println("taskMax " + taskMax(mutableListOf(0, 5, 3, 0, 10, 6, 100000)))
    println("taskPositive " + taskPositive(mutableListOf(-10, -20, -30, -40)))
    println("taskCool " + taskCool(mutableListOf(3, 14, -30, -40)))
    println("task25 " + task25(grades))
    println("task26 " + task26(listString))
    println("task27 " + task27(listString))
}

//Задачи на приведение коллекции к значению
fun task1(list: List<Int>) {
    val checkSizeList = list.size > 5
    println("Проверить, что размер коллекции больше 5 элементов. " + checkSizeList)
    println("Проверить, что коллекция пустая " + list.isEmpty())
    println("Взять элемент по индексу или создать значение если индекса не существует index 2= " + list.get(2))

//Собрать коллекцию в строку
    println("Собрать коллекцию в строку " + list.joinToString())

//Посчитать сумму всех значений
    println("Посчитать сумму всех значений " + list.sum())

//Посчитать среднее
    println("Посчитать среднее " + list.average())

//Взять максимальное число
    println("Взять максимальное число " + list.maxOrNull())


//Взять минимальное число
    println("Взять минимальное число " + list.minOrNull())

//Взять первое число или null
    println("Взять первое число или null " + list.firstOrNull())

//Проверить что коллекция содержит элемент
    println("Проверить что коллекция содержит элемент 1 = " + list.contains(1))


}

//Задачи на обработку коллекций
fun task2() {
    val listString: List<String?> = mutableListOf("apple", "orange", null, "potato", "tomato", "orange")
    val list = mutableListOf(1, 5, 3, 0, 10, 6, 16)

//Отфильтровать коллекцию по диапазону 18-30
    println("Отфильтровать коллекцию по диапазону 18-30 " + list.filter { it in 18..30 })
//Выбрать числа, которые не делятся на 2 и 3 одновременно

//Очистить текстовую коллекцию от null элементов
    println("Очистить текстовую коллекцию от null элементов " + listString.filterNotNull())

//Преобразовать текстовую коллекцию в коллекцию длин слов
    println("Преобразовать текстовую коллекцию в коллекцию длин слов " + listString.map { it?.length })

//Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    println("Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов " + listString.associateWith { it?.reversed()?.length })

//Отсортировать список в алфавитном порядке
    println("Отсортировать список в алфавитном порядке " + listString.sortedBy { it })

//Взять первые 3 элемента списка
    println("Отсортировать список в алфавитном порядке " + listString.take(3))

//Распечатать квадраты элементов списка
    println("Распечатать квадраты элементов списка " + list.associate { it to it * it })

//Группировать список по первой букве слов
    println("Группировать список по первой букве слов " + listString.groupBy { it?.first() })

//Очистить список от дублей
    println("Очистить список от дублей " + listString.distinct())

//Отсортировать список по убыванию
    println("Отсортировать список по убыванию " + list.sortedDescending())

//Взять последние 3 элемента списка
    println("Взять последние 3 элемента списка " + listString.takeLast(3))

}

//Задача 24. Характеристика числовой коллекции

//Если коллекция пустая - “Пусто”
fun taskEmpty(list: List<Int>): String {
    return when {
        list.isEmpty() -> "Пусто"
        else -> "Уникальная"

    }
}

//Если количество элементов меньше пяти - “Короткая”
fun taskShort(list: List<Int>): String {
    return when {
        list.size <= 5 -> "Короткая"
        else -> "Уникальная"

    }
}

//Если коллекция начинается с 0 - “Стартовая”
fun taskStart(list: List<Int>): String {
    return when {
        list.first() == 0 -> "Стартовая"
        else -> "Уникальная"

    }
}

//Если сумма всех чисел больше 10000 - “Массивная”
fun taskMax(list: List<Int>): String {
    return when {
        list.sum() > 10000 -> "Массивная"
        else -> "Уникальная"

    }
}

//Если среднее значение равно 10 - “Сбалансированная”
fun taskAverage(list: List<Int>): String {
    return when {
        list.average() > 10 -> "Сбалансированная"
        else -> "Уникальная"
    }
}

//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
fun taskMerge(list: List<Int>): String {
    return when {
        list.average() > 10 -> "Клейкая"
        else -> "Уникальная"
    }
}

//Если максимальное число меньше -10 - “Отрицательная”
fun taskNegative(list: List<Int>): String {
    return when {
        list.max() < -10 -> "Отрицательная"
        else -> "Уникальная"

    }
}

//Если минимальное число больше 1000 - “Положительная”
fun taskPositive(list: List<Int>): String {
    return when {
        list.min() > 1000 -> "Положительная"
        else -> "Уникальная"

    }
}

//Если содержит одновременно числа 3 и 14 - “Пи***тая” Иначе - “Уникальная
fun taskCool(list: List<Int>): String {
    return when {
        list.contains(3) && list.contains(14) -> "Классная"
        else -> "Уникальная"

    }
}

//Задача 25.Анализ учебных оценок
//Напиши функцию, которая принимает список чисел и возвращает список чисел.
//Пример данных: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60),
//отсортировать оставшиеся по возрастанию и взять первые 3.
//Вызывай методы обработки и фильтрации последовательно один из другого, чтобы результат предыдущего метода являлся основой для следующего.

fun task25(list: List<Int>): List<Int> {
    return list.filter { it >= 60 }
        .sortedBy { it }
        .take(3)

}

//Задача 26. Создание каталога по первой букве
//Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.

fun task26(list: List<String>): Map<Char, List<String>> {
    return list.groupBy { it.first() }
}

//Задание 27. Подсчёт средней длины слов в списке
//Напиши функцию, которая принимает список строк и возвращает строку.
//
//Начальные значения взять из предыдущей задачи.
//
//Цель: Перевести все слова в количество букв, подсчитать среднее значение.
// Вернуть форматированный текст с двумя знаками после запятой, используя функцию format и подходящий шаблон.
fun task27(list: List<String>): String {
    val totalLetters = list.sumOf { it.length }
    val average = totalLetters / list.size.toDouble()
    return "%.2f".format(average)
}