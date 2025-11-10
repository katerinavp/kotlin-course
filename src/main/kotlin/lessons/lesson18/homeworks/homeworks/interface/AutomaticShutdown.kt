package lessons.lesson18.homeworks.homeworks.`interface`

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}