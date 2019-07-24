package Class_Object

fun main(args : Array<String>){
    var button = Button()
    button.onClick()
    button.normalFunction()

}

interface MyInterface{
    var name : String
    fun onClick()
    fun  normalFunction(){ // all nomal fuction are public and open not final
    println("Interface code")
    }
}
class Button : MyInterface{
    override var name: String = ""

    override fun onClick() {
        println("OnClick")
    }

    override fun normalFunction() {
        super.normalFunction()
        println("Normal Function")
    }

}