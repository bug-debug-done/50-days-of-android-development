class Students constructor(firstName:String="Ashutosh"){
    val name:String
    var lastName:String?=null

    init{
        this.name=firstName
    }
    constructor(firstName:String,lastName:String): this(firstName){
        this.lastName=lastName
    }
}
fun main(args: Array<String>) {
    val student:Students=Students()
    println("This is the complete name ${student.name} ${student.lastName}")


    val student1:Students=Students("Ashutosh","Choudhary")
    println("This is the complete name ${student1.name} ${student1.lastName}")
}