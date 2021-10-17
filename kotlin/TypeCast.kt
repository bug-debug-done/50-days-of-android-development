fun main() {
    val name:Any="Ashutosh"


    val nameOne :String =name as String



    println(nameOne)



    val x:Int=7
  //  val y:Long=x as Long //This cast can never succeed as Integer cannot be cast to class java.lang.Long



  val z:Long?=x as? Long // as? will return null if casting is not possible so long has to be a nullable type
  println(z)

}