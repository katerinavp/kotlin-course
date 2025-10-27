package lessons.lesson14.homeworks

import kotlin.math.cos

//Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert(val group: String, val location: String,val cost:Int, val capacity:Int) {

    private var sellTicket:Int=0
    fun buyTicket(){
        if(sellTicket< capacity)
        println("info about concert: "+ group + ", " + location+ ", "+ cost+", "+capacity)
        sellTicket +=sellTicket
    }
}