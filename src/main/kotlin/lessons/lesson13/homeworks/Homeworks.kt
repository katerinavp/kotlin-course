package lessons.lesson13.homeworks

fun main() {
    val map1 = mapOf(
        "testLogin" to 2.5,
        "testRegistration" to 3.0,
        "testSearch" to 1.5
    )
    var map3 = mutableMapOf(
        "testLogin" to "passed",
        "testRegistration" to "failed",
        "testLogOut" to "skiiped"
    )
    task1(map1)
    task3(map3)
    var bugs = mutableMapOf(
        "bug1" to true,
        "bug2" to false
    )
    bugs(bugs)

    val testResults = mapOf(
        "https://example.com/page1" to "OK",
        "https://example.com/page2" to "ERROR",
        "https://example.com/page3" to "TIMEOUT"
    )
    task4(testResults)
    val servicesResponseTime = mapOf(
        "ServiceA" to 150,
        "ServiceB" to 80,
        "ServiceC" to 200,
        "ServiceD" to 120
    )
    task5(servicesResponseTime)

    val apiTestResults = mapOf(
        "/users/getUserInfo" to "SUCCESS",
        "/products/listProducts" to "FAILURE",
        "/orders/createOrder" to "TIMEOUT"
    )
    val endpointToCheck = "/users/getUserInfo"

    task6(apiTestResults, endpointToCheck)

    val testEnvironmentConfig = mapOf(
        "browserType" to "Chrome",
        "screenResolution" to "1920x1080"
    )
    task7(testEnvironmentConfig)

    val versionsMap = mapOf(
        "version1" to "1.0.0",
        "version2" to "2.0.0",
        "version3" to "3.0.0"
    )
    task8(versionsMap)

    val settings = mapOf(
        "iPhone XR" to "resolution=HD, colorDepth=24bit",
        "Samsung Galaxy A51" to "resolution=FHD+, colorDepth=32bit",
        "Google Pixel 4a" to "resolution=Full HD, colorDepth=24bit"
    )
    task9(settings)
    val errors = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error",
        403 to "Forbidden"
    )
    task12(errors)
    val testScenarios = mapOf(
        "TestScenario1_V1" to "Passed",
        "TestScenario2_V2" to "Failed",
        "TestScenario3_V1" to "Skipped",
        "TestScenario4_V3" to "Passed",
        "TestScenario5_V2" to "Passed"
    )
    task13(testScenarios)
    val modulesTestingResult = mapOf(
        "LoginModule" to "passed",
        "PaymentModule" to "failed",
        "SearchModule" to "passed"
    )
    task14(modulesTestingResult)
}

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.

fun task1(map: Map<String, Double>): Double {
    return map.values.average()
}

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
fun task3(map3: MutableMap<String, String>) {
    println(" Выведите список всех тестовых методов " + map3.keys)
    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    map3.put("testNew", "passed")
    println(map3.keys)


//Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    println(
        "Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped) " +
                map3.count { (_, value) -> value == "passed" })
}

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
fun bugs(bugs: MutableMap<String, Boolean>) {
    val keysToRemove = bugs.filterValues { it == true }.keys
    keysToRemove.forEach { bugs.remove(it) }
    println("Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления) " + bugs)
}

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
fun task4(list: Map<String, String>) {

    list.forEach {
        println("URL страницы ${it.key}  статус ответа ${it.value}")
    }
}

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
fun task5(map: Map<String, Int>) {
    val limit = 100
    println("Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог. " + map.filter { it.value > limit }
        .toList())

}

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
fun task6(apiResults: Map<String, String>, endpoint: String) {
    println(
        apiResults.getOrDefault(
            "В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован. " +
                    endpoint, "Endpoint not tested"
        )
    )
}

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
fun task7(map: Map<String, String>) {
    val browserType = map["browserType"] as String
    println("Используется браузер типа: $browserType")
}

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
fun task8(map: Map<String, String>) {

    println(
        "Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию. " + map + Pair(
            "version4",
            "4.0.0"
        )
    )
}

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
fun task9(map: Map<String, String>) {
    val defaultSettings = "resolution=SD, colorDepth=16bit"
    println("task9 " + map.getOrElse("Xiaomi Mi Note Pro", { defaultSettings }))
}

//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
fun task12(map: Map<Int, String>) {
    println(
        "Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки " + map.containsKey(
            404
        )
    )
}

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
fun task13(map: Map<String, String>) {
    println(" " + map.filter { entry ->
        val parts = entry.key.split("_")
        parts.size >= 2 && parts.last().equals("V1")
    })
}

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
fun task14(map: Map<String, String>) {
    println(" " + map.values.any { it == "failed" })
}
//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

//Объедините два неизменяемых словаря с данными о багах.

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
//Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
//Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
//Проверьте, пуст ли словарь с ошибками компиляции тестов.
//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.


