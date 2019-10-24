fun main(args: Array<String>) {
    var age = 10
    if (age>19)
    {
        println("mature")
    }
    else
    {
        println("immature")

    }
    var score =65
    when(score){
        in 90..100-> println("A")
        in 80..89-> println("B")
        in 70..79-> println("C")
        in 60..69-> println("D")
        in 50..59-> println("E")
        else-> println("fail")

    }
    var day = 4
    when(day){
        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Wednesday")
        4-> println("Thursday")
        5-> println("Friday")
        6-> println("Satuday")
        7-> println("Sunday")
        else-> println("Invalid Day")
    }





}