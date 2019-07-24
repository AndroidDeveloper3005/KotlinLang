package Class_Object
//data class contain any class properties like equel,tostring,hascode and copy method
fun main(args : Array<String>){
    var userOne = User("H",1)
    var userTwo = User("H",1)
    if (userOne == userTwo){
        println("Equal")
    }else{
        println("Not Equal")
    }
    println(userOne)//or println(userOne.tostring)
    var newUser = userOne.copy("Annona")
    println(newUser)


}
data class User(var name : String , var id : Int){//data class compare the data of the object

}