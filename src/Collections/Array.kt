package Collections

//Array
fun main(args : Array<String>){
    //elements  0   0   0   0   0
    //index     0   1   2   3   4
    var myArray = Array<Int>(5) { 0 } // mutable . fixed size
    myArray[0] = 5
    myArray[3] = 10
    myArray[1] = 1
    myArray[2] = 4
    myArray[4] = 6
    //print using for each loop
    for ( element  in myArray){
        println(element)

    }
    //print using for loop
    for (index in 0.. myArray.size - 1){
        println(myArray[index])
    }


    //




}