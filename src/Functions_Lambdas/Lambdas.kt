package Functions_Lambdas
// Higher order function

//can take function as paramitter
//can return function
// can do both

fun higher_order(firstName : String , lastName : String , make : (String , String ) -> String){
    var result = make(firstName,lastName)
    println(result)

}

//Lambda expression syntax
//function with no name it has defile inside {}
fun  main(args : Array<String>){
    val make : (String , String ) ->String = { firstName , lastName -> " User first name is $firstName and last name is $lastName"}
    higher_order("Md.Abdulla Al Masud" , "Himel ",make)
}
