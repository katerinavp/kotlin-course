package lessons.lesson18.homeworks.homeworks.abstractclass

import lessons.lesson18.homeworks.homeworks.`interface`.SoundEmitting
import java.io.InputStream

abstract class SmartSpeaker: SoundEmitting {
    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }
}