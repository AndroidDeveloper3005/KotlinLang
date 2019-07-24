package Class_Object

fun main(args : Array<String>){
    Customar.count = 10

    println(Customar.count)

    Customar.count = 100
    println(Customar.count)

    println(Customar.typeOfCustomars())

    Customar.myMethod("Himel")

}
//singleton : one instance for kotlin we can not create object like student1,student2 etc
//kotlin create one object by default
//in kotlin we can not use static keyword

open class MyClass{
    open fun myMethod(name : String){
        println("MyClass")

    }

}

object Customar : MyClass(){
    var count :Int = -1
    fun typeOfCustomars() : String{
        return "Bangladeshi"
    }

    override fun myMethod(name: String) { // becoming static method
        super.myMethod(name)
        println("object Customar : " + name)
    }

}