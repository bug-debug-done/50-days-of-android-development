fun main(args: Array<String>) {
    var dis=0;
    val price=77;
    if(price<=50){
        dis=10
    }
    else if(price>70)
    {
        dis=20
    }
    else{
        dis=15
    }
    println(dis)



   var discount=if(price>50) 10 else 3
   println(discount)
}