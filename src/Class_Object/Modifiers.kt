package Class_Object

fun main(args : Array<String>){

}
open class Person{//super class
    private val a =1
    protected  val b = 2
    internal  val c =3 // new in kotlin
    val d = 4 // public bydefault

}
class  Bangladeshi : Person(){
    //a is not visible
    //b,c,d is visible
    fun test(){
        println(c)
    }

}
class  Testing{
    fun test(){
        var person = Person()
        println(person.d)
        //println(person.b)

    }

}