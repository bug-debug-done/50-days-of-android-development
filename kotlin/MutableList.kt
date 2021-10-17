fun main(args: Array<String>) {
      val names=mutableListOf("John","mark","Sarah","Finn")
    println(names.size)
        println(names.get(1))
            println(names[2])
                println(names.indexOf("Finn"))
                names.add("Test")
                println(names)
                names.remove("Mark")
                names.removeAt(0)
                names.set(0, "James")
                names[1]="AAAA"
                println(names)
                names.clear()
                                println(names)

}