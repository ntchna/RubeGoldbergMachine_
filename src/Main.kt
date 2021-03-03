import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main(args: Array<String>){

    var input: String
    do {
        addTwoNumbers()
        print("    1. If you want to enter numbers\n    2. If you want to end the attempt: ")
        input = readLine().toString()
    } while (input != "2")
}

fun addTwoNumbers(){
    println("   Here you can find the sum of even numbers between two values)")
    println("   Please enter your numbers ")

    val a: String = GetValue("First value ")
    val b: String = GetValue("Second value ")

    if(isNumber(a) && isNumber(b) ){
        println("   Ok, So what do we have...")
        print("Result: ")
        println(addValuesOfString(a.toInt(), b.toInt()))
    }
    else{
        println("Oops! You entered not only numbers")
    }
}

fun GetValue(string: String) : String {
    print("$string: ")
    return readLine().toString()
}

fun isNumber(string: String) : Boolean{
    try{
        parseInt(string)
    }catch (e: NumberFormatException){
        return false
    }
    return true
}

fun addValuesOfString(int1: Int, int2: Int): Int {
    var sum=0
    var result = 0
    var oddSum =0
    for (i in int1..int2){
        if (i%2 != 0){
            oddSum += i
        }
        else
            oddSum += 0
        sum +=i
        result = sum - oddSum
    }
    return result
}