package lessons.lesson14.homeworks

object Moon {
    val isVisible = true
    val phase = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println(" phase: " + phase)
        } else {
            println("invisible Moon")
        }
    }
}