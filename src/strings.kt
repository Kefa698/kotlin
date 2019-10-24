fun main(args: Array<String>) {
    var sentence ="The best way to score in Fifa 20"
    println(sentence.length)
//    sentence=sentence.toUpperCase()
    println(sentence.toUpperCase())
    var poem ="""
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20
        The best way to score in Fifa 20


        """".trimIndent()
    println(poem)

    var firstName ="John"
    var lastName ="Musa"
    var age=43
    var fullname=firstName + "  " + lastName + " "+age
    var full_name ="$firstName  $lastName $age"

    println(full_name)
    println(fullname)
}