package OOP

class Car(owner:String, color:String, price:Int, mileage:Int){


    init {
        println("Owner of the car is $owner")
        println("The car is color $color")
        println("The car is worth $price")
        println("It has a mileage of $mileage")
    }
}

fun main(args: Array<String>) {
    var owner_one = Car("Mike", "Red", 2500000, 2000)
    println("......end of car one......")
    var owner_two = Car("Brad", "White", 3500000, 40000)
    println("......end of car two......")
    var owner_three = Car("Ann", "Orange", 690000, 70000)
    println("......end of car three......")
}