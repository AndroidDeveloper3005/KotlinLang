package Basic_Syntax

fun main(args: Array<String> ){
    //var new value can be assaign any time any where
    var  a : Int = 5
    a +=1
    println(a)

    //val for only assaign local value we can not change thos value.like in java final keyword
    val b : Int = 6
    //b =5
    println(b)

    //kotlin can read data type itself.no need to define datatype
    var c = "text"
    println(c)

    var d : Int
    d = 5
    println(d)

/*  here some data type
    Double	64
    Float	32
    Long	64
    Int	32
    Short	16
    Byte	8*/
    //kotlin we have to write datatype after set value like this
    var f : Float
    f= 10.257F //in java we can do this like float i =(float) 10.257
    println(f)

    var num :Double
    num = 10.257//for double we not need  to declaire D
    println(num)


    //explicit type cast
    var test : Byte =5
    var test2 : Int = test.toInt()
    println("Convert Into Int : "+ test2)

    //some type conversion
    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

     /*
      Equality checks: a == b and a != b
      Comparison operators: a < b, a > b, a <= b, a >= b
      Range instantiation and range checks: a..b, x in a..b, x !in a..b
      */




}