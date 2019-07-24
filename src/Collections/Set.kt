package Collections

fun main(args : Array<String>){
    //set contains unique elements
    //hashset also contains unique elements but sequence is not guaranteed in output


    var myset = setOf<Int>(2,4,5,8,10,9,9,8,10)//read on;ly
    for (element in myset){
        println(element)
    }
    //hash set
    var myhashset = hashSetOf<Int>(2,4,5)
    myhashset.add(11)
    myhashset.add(6)

    for (value in myhashset){
        println("hast set "+value)
    }



}