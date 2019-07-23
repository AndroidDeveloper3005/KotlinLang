package Basics
//Control Flow: if, when, for, while
fun main(args:Array<String>){
    //If else Expression
    val a =5
    val b =6
    if (a>b){
        println(a)
    }else{
        println(b)
    }

    //When Expression
    //when replaces the switch operator of C-like languages
    val x : Int = 10
    when(x){
        1 -> println("1")
        2-> println("2")
        else -> println("dont no")
    }

    //For Loops
    //for (item: Int in ints) {
    // ...}

    for (i in 1..3){
        println(i)
    }

    for (i in 5 downTo 1 step 2){
        println(i)
    }

    //break and continue

    for (i in 1..10){
        if (i == 5){
            break
        }
        println(i)
    }


}