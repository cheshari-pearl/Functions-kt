//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    name("Pearl Cheshari")
    remainder(9,2)
    sum(3,11,1,97)
    fact("I like playing the guitar")
}

 fun name(name: String){
     println("Hello $ Pearl Cheshari")
 }

fun remainder(a:Int, b:Int){
    var result = a % b
    println(result)

}

fun sum(a: Int,b: Int,c: Int, d: Int ){
    var result = a + b + c +d
    println (result)
}

fun fact(fact: String){
    println("I like playing the guitar")
}