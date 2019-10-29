fun main(args: Array<String>) {
    var a = volume(height = 10f, radius = 7f)
    var b = volume(height = 55.56f, radius = 71.99f)
    var c = surface_area(height = 22f, radius = 7f)
    println(a)
    println(b)
    println(c)
    println(splitNames("John Musa"))
    println(splitNames("Mary Jane"))
    println(add(10, 20, 30))
//    println(add(10,20,))


}

//solid principles
fun volume(height: Float, radius: Float): Float {
    var v = 22 / 7 * height * radius * radius
//    println("volume of the cylinder is $v")
    return v;


}

fun surface_area(height: Float, radius: Float) {
    var area = (2 * 22 / 7 * radius * height) + (2 * 22 / 7 * radius * radius)
//    println("surface area is $area")
}

fun splitNames(fullName: String): List<String> {
    var splitted = fullName.split(" ")
    return splitted
}

fun add(a: Int, b: Int, c: Int = 0): Int {
    return a + b + c
    var test = "aaaaaaaaaaaaBbbbbbbbbbbbbbbbC"
    test = test.replace("c", "X", ignoreCase = true)
    println(test)
}