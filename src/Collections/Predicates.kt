package Collections

fun main(args : Array<String>){
    val numbers = listOf<Int>(2,3,4,5,6,11)
    val myPredicates = {num : Int -> num > 10}
    val check1 =numbers.all (myPredicates)
    println(check1)

    val check2 = numbers.any(myPredicates)
    println(check2)
    val check3 = numbers.count(myPredicates)
    println(check3)

    val check4 = numbers.find (myPredicates)
    println(check4)

}