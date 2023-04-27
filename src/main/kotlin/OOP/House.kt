package OOP

class House(owner:String, location:String, price:Int, doors:Int){


    init {
        println("Owner of the house is $owner")
        println("House is located in $location")
        println("Price is $price")
        println("It has $doors number of doors")
    }
}

fun main(args: Array<String>) {
    var owner_one = House("Mike", "Ngara", 25000, 2)
    println("......end of house one......")
    var owner_two = House("Brad", "Kitengela", 35000, 4)
    println("......end of house two......")
    var owner_three = House("Ann", "South B", 69000, 7)
    println("......end of house three......")
}