package Class_Object

fun main(args : Array<String>){
    var myButton = MyButton()
    myButton.onClick()
    myButton.onTouch()

}

interface MyInterfaceOne{
    fun onClick()
    fun  onTouch(){ // all nomal fuction are public and open not final
        println("InterfaceOne  : onTouch")
    }
}

interface MyInterfaceTwo{
    fun onClick(){
        println("InterfaceTwo : onClick")

    }
    fun  onTouch(){ // all nomal fuction are public and open not final
        println("InterfaceTwo : onTouch")
    }
}

class MyButton : MyInterfaceOne,MyInterfaceTwo{
    override fun onClick() {
        super.onClick()
    }

    override  fun onTouch() {
        super<MyInterfaceOne>.onTouch()
        super<MyInterfaceTwo>.onTouch()
    }

}