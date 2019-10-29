import kotlin.reflect.jvm.internal.impl.utils.NumbersKt

fun main() {
//    println(add(10,20))
//    println(add(m=15)) /*named parameter*/
//    println(multiply(10,20))
//    println(multiply(24))
//    println(multiply(x=25))
//    println(multiply(y=30,x=20))

    println(addMany(10.0, 3.1, 20.0))
    println(addMany(10.0, 3.1, 20.0, 11.2, 13.2, 22.3, 55.4, 5.5))

    var heights = doubleArrayOf(10.0, 3.1, 20.0, 11.2, 13.2, 22.3, 55.4, 5.5, 45.7, 66.78, 53.5)
    var total = addMany(*heights)
    println(total)

    var numbers = arrayOf("1000", 10, 12, 45.44, 65, 89, 65.789, 6789.6787, 67, 90)
    println(findMax(*numbers, second = 10.11))
}

fun add(k: Int = 5, m: Int): Int /*k is optional parameter*/ {
    var result = k + m
    return result
}

fun multiply(x: Int, y: Int = 6): Int {
    return x * y
}

fun addMany(vararg numbers: Double): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    return sum


}

fun findMax(vararg numbers: Any, second: Double): Double {
    var max: Double = 0.0
    for (num in numbers) {
        var x = num.toString().toDouble()
        if (x > max)
            max = x
    }
    return max
}