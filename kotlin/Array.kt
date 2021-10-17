fun main(args: Array<String>) {
    val arr=arrayOf(1,2,3,4,5,6,7,8,9)
    println(arr.get(7))
    println(arr[7])
    println(arr.joinToString(","))
    arr.set(7, 77)
    arr[2]=7777
        println(arr.joinToString(","))

        val numbers=Array(7) { 0 }
                println(numbers.joinToString(","))



}