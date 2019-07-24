package Class_Object

fun main(args : Array<String>){

}
abstract  class Test{
    abstract var name :String
    abstract fun eat()//abstract method

    open fun getHight(){}
    fun goToSchool(){} // a normal function : by default public and final


}
class Indian : Test(){

    override var name: String = "himel"
    override fun eat() {

    }

    override fun getHight(){

    }

}