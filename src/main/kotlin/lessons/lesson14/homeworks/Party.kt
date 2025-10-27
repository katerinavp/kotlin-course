package lessons.lesson14.homeworks

class Party(val location :String,
                val attendees :Int) {

    fun details(){
        println("место "+location+" кол-во гостей "+attendees)
    }
}