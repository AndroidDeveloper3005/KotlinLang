package NullSafty

val pi : Float by lazy {
    3.14f
}
fun main (args : Array<String>){
    println("Some initial Code ...")

    val areaOne = pi * 4 * 4
    val areaTwo = pi * 4 * 4

    println("Some more Code ...")

}