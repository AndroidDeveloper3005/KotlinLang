package Class_Object

fun main (args: Array<String>){
    var student = Student("H",10)
    print( student.id)

}
class Student(var name : String){//primary constructor
    var id : Int = -1

    init {
        println("Name of the student is $name")
    }
    //Secondary Constructor
    constructor(n: String , id : Int): this(n){//need to call primary constructor
        //Body of the Secondary Constructor is called after the init block
        this.id = id

    }
}