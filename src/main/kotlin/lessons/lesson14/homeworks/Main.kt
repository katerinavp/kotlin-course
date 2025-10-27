package lessons.lesson14.homeworks

class Main {
    fun main() {
        val concert = Concert("Баста", "Москва", 2500, 2000)
        concert.buyTicket()
        val emotion = Emotion("Смех", 100)
        emotion.express()
        val party = Party("New York", 10000)
        party.details()
        val product = Product("apple", 100, 100)
        Moon.showPhase()

        val shelve = Shelve(5)
        shelve.addItem("A")
        shelve.removeItem("B")
        shelve.canAccommodate("A")
        shelve.containsItem("A")
        shelve.getItems()
    }
}