class Student{
    val school:String="Dps"
    var age:Int=5

    val isTeenager:Boolean
    get()=age>12

    var name:String?=null
    get()=field?:"Unknown"
    set(value){
        if(value!=null) field=value
    }

}
fun main(args: Array<String>) {
    val student:Student=Student()
    println(student.isTeenager)
    student.age=17
        println(student.isTeenager)

        println(student.name)
        student.name="Ashutosh"
        println(student.name)

    
}