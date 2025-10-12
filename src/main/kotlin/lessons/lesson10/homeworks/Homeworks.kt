package lessons.lesson10.homeworks

fun main() {
    task1()
}

//Задачи на работу со словарём

fun task1() {
    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map = mapOf<Float, Double>(1.3f to 2.2, 2.2f to 2.2)
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3 = mutableMapOf<Int, String>(1 to "apple", 2 to "orange")
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    map3.put(3, "potato")

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    val value3 = map3.get(3)
    val value4 = map3.get(4)
    println("values3 " + value3 + " value4 " + value4)
//Удалите определенный элемент из изменяемого словаря по его ключу.
    map3.remove(3)
    println("values3 " + map3.get(3))

//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0
// (в этом случае выведи слово “бесконечность”)
    val map5 = mapOf<Double, Int>(
        8.0 to 2,
        6.0 to 3,
        10.0 to 0 // здесь будет деление на ноль
    )

    for ((key, value) in map5) {
        if (value != 0) println("Результат деления: ${key / value}")
        else println("бесконечность")
    }
//Измените значение для существующего ключа в изменяемом словаре.
    val mapMutable = mutableMapOf<String, Int>("яблоко" to 10, "груша" to 5)
    mapMutable["яблоко"] = 20 // меняем количество яблок
    println(mapMutable)
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val dict1 = mapOf<Int, String>(1 to "один", 2 to "два")
    val dict2 = mapOf<Int, String>(3 to "три", 4 to "четыре")

    val mergedDict = mutableMapOf<Int, String>()
    for ((k, v) in dict1) mergedDict[k] = v
    for ((k, v) in dict2) mergedDict[k] = v

    println("merged " + mergedDict) // {1="один", 2="два", 3="три", 4="четыре"}
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val stringToListMap = mutableMapOf<String, List<Int>>()
    stringToListMap["красный"] = listOf(1, 2, 3)
    stringToListMap["зеленый"] = listOf(4, 5, 6)

    println(stringToListMap) // {"красный":[1, 2, 3], "зеленый":[4, 5, 6]}
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val intToSetMap = mutableMapOf<Int, MutableSet<String>>(
        1 to mutableSetOf("Москва"),
        2 to mutableSetOf("Санкт-Петербург")
    )

    intToSetMap.getValue(1).add("Казань") // добавляем город в существующее множество
    println(intToSetMap) // {1=["Москва", "Казань"], 2=["Санкт-Петербург"]}
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val pairMap = mapOf<Pair<Int, Int>, String>(
        Pair(1, 2) to "не подходит",
        Pair(5, 6) to "подходит",
        Pair(7, 5) to "также подходит"
    )

    for ((pair, value) in pairMap) {
        if (pair.first == 5 || pair.second == 5) println(value)
    }
}