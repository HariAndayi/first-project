fun main(args: Array<String>) {
    println("Enter your age:")
    var age = readln()!!.toInt()
    val currentyear = java.time.Year.now().value!!.toInt()
    var yob = (currentyear-age)
    println("You were born in the year $yob")
}