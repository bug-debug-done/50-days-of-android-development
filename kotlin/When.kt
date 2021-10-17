fun main() {
    val raiting=5
    val result=when(raiting){
        5->"Good"
        3,4->"ok"
        1,2->"poor"
        else{
            println("No rating")
            "Zero"
        }
    }
    println("$result")
}