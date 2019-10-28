fun main(args: Array<String>) {

    var x: Int? = 100 /*int can be null*/
//    x =null
    println(x?.toFloat())
    println(x.toString())

    if (x != null) {
        var result = x * x
        println(result)
    }
    var result = x!! * x
    println(result)
}