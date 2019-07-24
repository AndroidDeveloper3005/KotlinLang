package Class_Object

fun main(args : Array<String>){
    var dogs = Dogs("White","Pug")

}
/*
//primary constructor
open class Animal(var color : String){
    init {
        println("From Animal Init : $color ")
    }

}

class Dogs(color : String ,var breed : String ) : Animal(color){

    init {
        println("From dog Init : $color and $breed")
    }
}*/

//secondary constructor
open class Animal {
     var color : String =""
    constructor(color: String){
        this.color = color
        println("From Animal  : $color ")
    }
}

class Dogs : Animal {
    var breed : String = ""
    constructor(color : String  , breed : String) : super(color){
        this.breed = breed
        println("From dog  : $color and $breed")


    }
}
