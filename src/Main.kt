import Class.Person

fun main(args: Array<String>) {

    var person = Person("Victor", "Kim", 30)

    if (person.age > 29){
        println("Добро пожаловать, Вам больше 30 лет!")
    } else if (person.age > 17){
        println("Добро пожаловать, вам больше 18 лет!")
    } else {
        println("Вам нет 18 лет!")
//    }
//    var dayOfWeek = "Пятница"
//when (dayOfWeek){
//    "Понедельник" -> println("Сегодня понедельник - день тяжелый")
//    "Вторник" -> println("Сегодня вторник")
//    "Среда" -> println("Сегодня среда")
//        "Четверг" -> println("Сегодня четверг и скоро пятница")
//    "Пятница" -> println("Сегодня пятница, наконец")
//    else -> println("Сегодня выходной, выдохни")

}
    }






