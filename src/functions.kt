// inbuilt functions

fun main() {
    var text = "the quick brown box for jumped over lazy dog"
    println(text.toUpperCase())
    var upper = text.toUpperCase()
    println(upper)
    var k = text.capitalize()
    println(k)

    print("please enter your age:")
    var age = readLine()

    println("age is $age")


    println("Enter your names")
    var names = readLine()/*John Musa*/
    var splitted = names?.split(" ")
    var firstName = splitted?.get(0) ?: "Guest"/*? null check*/
    var lastName = splitted?.get(1) ?: "Guest"/*?:elvis alternative*/
    print("your first name is $firstName and your surname is $lastName")

}
