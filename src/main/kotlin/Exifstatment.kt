fun main(args: Array<String>) {
    println("Enter your name")
    var name = readln()!!.toString()

    println("Enter Your age")
    var age = readln()!!.toInt()

    if (age >= 18){
        println("Welcome to the 18 club $name!")
    }
    else {
        println("Uneligible")
    }
}