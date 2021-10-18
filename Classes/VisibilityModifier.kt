
class Students2 private constructor(val name: String="Mark"){
    constructor(firstName:String,lastName:String):this("$firstName $lastName")
}






fun main() {
   // var student:Students2=Students2("John")
    var student2=Students2("John","Doe")
  //  println(student.name)
    println(student2.name)
}