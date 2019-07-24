package Class_Object

fun main(args : Array<String>){
    var dog = Dog()
    dog.eat()
/*    dog.bread = "labra"
    dog.color = "red"
    dog.bark()
    dog.eat()*/

    var cat = Cat()
    cat.eat()
/*    cat.age = 7
    cat.color = "black"
    cat.meow()
    cat.eat()*/

    var animal = Animals()
    //animal.color = "white"
    animal.eat()


}
//in kotlin for inheritance we need to use open keyword
//in kotlin Any is the Super class of all class like java Object Class
open class Animals{
    var color : String = ""
    open fun eat(){
        println(" animal eating")
    }

}

 class Dog : Animals() { // for use inheritance class we use : keyword

     var bread : String =""
     fun bark(){
         println("Bark")
     }

     override fun eat() {
         super.eat()
         println("Dog eating")
     }

}
public final class Cat : Animals(){
    var age : Int = -1
    fun meow(){
        println("Meow")
    }

    override fun eat() {
        super.eat()
        println("Cat eating")
    }

}