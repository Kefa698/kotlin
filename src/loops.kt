fun main(args: Array<String>) {

//    loops
    for (x in 1..20) {
        if (x == 5)
            continue
        println(x)
        if (x == 13)
            break
    }
    println("-------WHILE LOOP------")

    var z = 1
    while (z <= 100) {
        println("Kefa $z")
        z += 2
    }

    println("---------DO WHILE LOOP------")
    var k = 10
    do {
        println("k is $k")
        k++
    } while (k <= 100)

//    fizzbuzz
//    3==fizz
//    5==buzz
//    3 and 5===fizzbuzz
}