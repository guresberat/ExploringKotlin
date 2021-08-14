package com.example.helloworld

fun main(){
    val result = addUp(5,3)
    print("result is $result")

    print("\naverage is ${average(5.3,13.37)}")
}

fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun average(a: Double, b:Double) : Double{
    return (a+b)/2
}

fun myFunction(){
    print("Called From myFunction")
}