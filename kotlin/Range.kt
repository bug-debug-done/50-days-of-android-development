fun main(args: Array<String>) {
    println("Line 1")
    for(i in 1..5){
        print(" "+i)
    }
        println("\nLine 2")
        if(4 !in 5..10){
            println("Not There")
        }
            println("\nLine 3")
            for(i in 1 until 5){
                print(" "+i)
            }
                println("\nLine 4")
                for(i in 1..5 step 2){
                    print(" "+i)
                }
                  println("\nLine 5")
                  for(i in 5 downTo 1){
                    print(" "+i)
                  }




}