fun main(args: Array<String>) {
    var pin:Int

    do {
        println("Enter your pin:")
        pin = readln()!!.toInt()
    } while (pin != 1220)

    println("Correct Pin")
}