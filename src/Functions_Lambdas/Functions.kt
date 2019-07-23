package Functions_Lambdas

fun main(args:Array<String>){
    var a =5
    var b =6
    println(addition(a,b))
    println(add(a,b))

    var result : Long
    result = factorial(a)
    println(result)

    var n = 3
    println("Factorial of $n is :  ${factorial(n)}")

}
fun addition( a : Int , b : Int) : Int { // with  return type
    return a + b
}
fun add( a : Int , b : Int)  { // with out return type
    println(a + b)
}

fun factorial(a: Int) : Long{
    return if (a == 1)a.toLong()
    else a * factorial(a -1)
}

//Tail Recursion calculation are calculate first
tailrec fun  factorial(n : Int , run : Int = 1): Long {
    return  if (n ==1 ) {
        run.toLong()
    }
    else{
        factorial(n - 1 ,run * n)
    }
}


