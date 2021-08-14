package com.example.helloworld

fun main(){
    val arrayList = ArrayList<Double>()
    var avg: Double = 0.0
    arrayList.add(2.9)
    arrayList.add(5.6)
    arrayList.add(4.0)
    arrayList.add(2.5)
    arrayList.add(3.0)
    for(i in arrayList){
        avg +=i
    }
    println(avg/arrayList.size)
}