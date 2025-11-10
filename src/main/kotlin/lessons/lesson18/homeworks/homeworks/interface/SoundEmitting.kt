package lessons.lesson18.homeworks.homeworks.`interface`

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}