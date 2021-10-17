fun main(args: Array<String>) {
      val names=mutableSetOf("John","mark","Sarah","Finn")
    println(names.size)
    println(names.contains("Finn"))
      
                println(names.indexOf("Finn"))  //should not be used

    names.add("Adding")
    println(names)
    names.add("Finn")// it will not be added because it will be a duplicate item
    println(names)
    names.remove("Adding")
        println(names)



}