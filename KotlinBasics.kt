package com.example.helloworld


fun main(){

    //immutable variable
    // TODO: Add new functionality
    /*
    This
    is a
    multiline
    comment
    */

    //type string
    val myName = "Berat"
    //type int 32 bit
    var myAge = 21
    //strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //println("First " + firstCharInStr)
    //println("Last " + lastCharInStr)

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    //println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    //println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    //println("isNotEqual is $isNotEqual")

    //println("is5Greater3 ${5 > 3}")
    //println("is5LowerEqual3 ${5 >= 3}")
    //println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    //println("myNum is $myNum")
    myNum *= 4
    //println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    //println("myNum is $myNum")
    // increments after use
    //println("myNum is ${myNum++}")
    // increments before use
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")

    val age = 31

    if(age >=30)
        println("You're over 30")

    if(age >= 21){
        println("You can drink in US")
    }else if(age >= 18){
        println("You can vote")
    }else if(age >= 16){
        println("You may drive")
    }else{
        println("You were too young")
    }


    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autmn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }



    var age = 31
    when(age){
        !in 0..20 -> println("You can drink in US")
        in 18..150 -> println("You can vote")
        in 16..150 -> println("You may drive")
        else -> println("You were too young")
    }

    var x :Any = "13.37f"
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not  a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")



    }

    var x = 100
    while(x>0){
        if (x % 2 == 0)
            print("$x")
        x--
    }

    var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }

    var y = 1
    while(y <= 10) {
        println("$y ")
        y++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10) {
        print("$num ")
    }

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }

    for(i in 0..10000){
        if (i==9001)
            println("IT'S OVER 9000!!!")
    }

    var humidiyyLevel = 80
    var humidity = "humid"
    while(humidity == "humid"){
        if(humidity == "humid") {
            humidiyyLevel -= 5
            println("humidity decreased")
        }
        if(humidiyyLevel<=60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }

}