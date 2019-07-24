package NullSafty

fun main(args:Array<String>){
    var country = Country()
/*    country.name = " BD"
    println(country.name)*/
    country.setup()

}
class Country{
    //lateinit used only with mutable data type {var}
    //lateinit used only with non - nullable data type
    //lateinit  values must be initialized before use it
    lateinit var name : String
    fun setup(){
        name = "USA"
        println(name)

    }

}