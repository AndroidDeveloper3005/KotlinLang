package Collections

fun main(args : Array<String>){


    //Immutable collection
    var list = listOf<String>("Himel","Annona","Shoshi") // Immutable fixed size read only
    for (index in 0.. list.size - 1){
        println(list[index])//also can write list.get(index)
    }

    //mutale collection
    var name  = mutableListOf<String>("Himel","Shoshi")//no fixed size you can add as many as or remove
    name.add(2,"Annona")

    for (index in 0..name.size - 1){
        println("Mutable list : "+name[index])
    }
    //arraylist
    var nameArrayList  = mutableListOf<String>("Himel","Shoshi")//no fixed size you can add as many as or remove
    nameArrayList.add(2,"Annona")

    for (index in 0..nameArrayList.size - 1){
        println("Array list : "+nameArrayList[index])
    }
}

