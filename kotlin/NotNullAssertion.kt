fun main() {
    

    printNameLength("Ashutosh","Choudhary")
    //   printNameLength("Ashutosh",null)


}

fun printNameLength(firstName:String?,lastName:String?){
    if(firstName!=null){
        println("Name: ${firstName.length}${lastName!!.length}")
        // !!. tells the compiler that not to check it for null
        println("Name: ${firstName.length}${lastName?.length}")

    }
}