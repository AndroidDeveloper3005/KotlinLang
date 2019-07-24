package NullSafty

fun main(args : Array<String>){
    var name :String? = null

    /*
    1) safe call ( ?. )
       //return the length if name is not null else return null
       //use it if you dont mind getting null value

     */
    println("The length of name is ${name?.length}")

    /*
    2) safe call with let ( ?.let )
        //It execute the block only  if name is not null

    */
    name?.let {
        println("The length of name is ${name.length}")
    }

    /*
    3) Elvis - operator ( ?: )
        //when we have nullable reference "name ,we can say " is name is not null" we use it
        //otherwise use some non-null value

    */
    val len = if (name !=null)
        name.length
    else
        -1 //we can writte this block as like this (val length = name?.length ?: -1 )

    println("The length of name is $len")


    /*
    4) Non - null assertion operator  ( !! )
        //we use it when we sure the value is not null
        //throws NullPointerEXCEPTION IF THE VALUE IS FOUND TO BE NULL
    */
    println("The length of name is ${name!!.length} ")


}
