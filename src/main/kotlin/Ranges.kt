fun main() {
    val closedRange = 1..5
    val halfOpenRange = 1 until 5
    println(closedRange)
    println(halfOpenRange)


    //For Loops
    val count =10
    var sum =0
    for (i in 1..count){
        sum +=i
        println(sum)
    }

    // Repeat Loops
    sum  =1
    var lastSum = 0
    repeat(10){
        val temp =sum
        sum += lastSum
        lastSum =temp
        println(lastSum)
    }



}