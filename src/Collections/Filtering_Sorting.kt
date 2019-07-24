package Collections
//filter : filter our desired elements from a collection
//map : perform operations ,modify elements
//Predicates Or a condition that return TRUE OR FALSE=>
    //>all : do all element satisfy the condition?
    //>any :  do any element satisfy the condition?
    //>count : total  element satisfy the condition?
    //> find : return the first element that satisfy condition
//>flatmap : filter elements from a collection of collection
//>distinct ; return unique result


fun main(args : Array<String>){
    //filter ___ return a list containing only elements matching the given predicate
    //map __ return a list containing  the result of applying the given {transform function

    val myNumbers : List<Int> = listOf(0,2,4,6,8,10)
    //filter
    val smalNumber: List<Int> = myNumbers.filter { it < 4 } // Or num -> num < 10
    for (num in smalNumber){
        println(num)
    }
    //map
    val mySquareNum = myNumbers.map { num -> num * num } //Or it * it
    for (num in mySquareNum){
        println(num)
    }
    //filter and map
    val mysmallSquareNum = myNumbers.filter { it <8  }.map { it *it }
    println("Filter and Map :\n")
    for (num in mysmallSquareNum){
        println(num)
    }

    //filter and map using class
    var people = listOf<Person>(Person(26,"Himel")
            , Person(25,"Annona"))
    var names = people.filter { person -> person.name.startsWith("A") }.map { it.name }
    for (name in names){
        println(name)
    }

}

class Person(var age : Int , var name : String ){


}
