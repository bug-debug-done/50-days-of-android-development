fun main(args: Array<String>) {

    println(add(7,7))
    fullName("Ashutosh", "Choudhary")
    fullName("ABCD")
    
}
fun add(num1:Int,num2:Int): Int{
    return num1+num2
}
fun fullName(firstName:String,lastName:String="XYZZ"): Unit{ //this function will also have a return type Unit
    println(firstName+" " +lastName)
}