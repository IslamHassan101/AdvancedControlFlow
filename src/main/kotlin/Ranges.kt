fun main() {
    val closedRange = 1..5
    val halfOpenRange = 1 until 5
    println(closedRange)
    println(halfOpenRange)

    repeat(10){
        print("*")
    }
    println()
    //For Loops
    val count =10
    var sum =0
    for (i in 1..count){
        sum +=i
        println(sum)
    }
    repeat(10){
        print("*")
    }
    println()
    // Repeat Loops
    sum  =1
    var lastSum = 0
    repeat(10){
        val temp =sum
        sum += lastSum
        lastSum =temp
        println(lastSum)
    }
    repeat(10){
        print("*")
    }
    println()
    //Steps in loops
    sum =0
    for(i in 1..count step 2){
        sum +=i
        println(sum)
    }
    repeat(10){
        print("*")
    }
    println()
    sum = 0
    for (i in count downTo 1 step 2){
        sum +=i
        println(sum)
    }

}