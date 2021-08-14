package com.example.helloworld

import java.lang.IllegalArgumentException
import java.util.*

fun main(){
    var myCar = Car()
    println("brand is ${myCar.myBrand}")
    myCar.maxSpeed = -5
    println("maxSpeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

class Car(){
    lateinit var owner : String
    val myBrand: String = "BMW"
    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 250
        //get() = field
        set(value){
            field = if(value > 0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}