package Collections

fun main(args : Array<String>){
    //map : key - value pair

    var mymap = mapOf<String,String>("name" to "Himel") //Immutable . fixed size read only
    for (key in mymap.keys){//using individual element (Objects
        println("Element at Key : $key = ${mymap.get(key)}")//myMap.get(key

    }

    /// mutable .No fixed size read and write
    var hashMap = HashMap<Int,String>()
    hashMap.put(1,"H")
    hashMap.put(2,"A")
    for (key in hashMap.keys){
        println("Element at Key : $key = ${hashMap.get(key)}")

    }

}