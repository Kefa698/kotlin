fun main(args: Array<String>) {
//immutable->cant be changed
    var scores = listOf(10, 67, 81, 90, 43, 77, 56, 79, 90, 34, 55)
    var names = listOf("Jane", "Jack", "Jerry", "Jim", "jully", "Justin")
    var cities = listOf<String>("Nrb", "Mbs", "NY")

    println(scores[1])/*second scores*/
    println(names[3])/*fourth name*/


//    add mutable
    var marks = arrayListOf(10, 64, 56, 78, 34, 56, 78, 90, 51, 23)
    println(marks[4])
    marks.add(99)
    marks.add(91)
    println(marks)

    marks.remove(56)
    println(marks)

//    marks.size
//    marks.clear

//    marks.first
//    marks.last


    /*loop*/


//    % ==DIVISBLE


}