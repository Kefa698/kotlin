fun main(args: Array<String>) {
    for (k in 1..100)
        if (k % 3 == 0)
            println("fizz $k")

    println("--------buzz------")

    for (r in 1..100)
        if (r % 5 == 0)
            println("fuzz $r")

    println("--------fizzbuzz------")
    for (n in 1..100)
        if (n % 3 == 0 && n % 5 == 0)
            println("fizzbuzz $n")


}