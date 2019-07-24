package Class_Object
fun main(args:Array<String>){
    var customer = Customer("Himel") // object
    //customer.name = "Himel"
    //println("My name is ${ customer.name}")

}
//primary constructor
class Customer constructor(var name : String){//class
    //var name : String ="name"
    init {
        //this.name = name
        println("My name is $name")
    }
}


