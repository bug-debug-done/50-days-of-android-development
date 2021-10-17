fun main(args: Array<String>) {
    val classRanks=mapOf(1 to "Sarah",2 to "Mark",3 to "Finn",4 to "John")
    println(classRanks.values)
    println(classRanks.keys)
    println(classRanks.containsValue("Finn"))
    println(classRanks.containsKey(4))
        println(classRanks.get(1))

}