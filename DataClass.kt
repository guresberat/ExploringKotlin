package com.example.helloworld

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"Denis")

    //val name = user1.name
    //println(name)
    user1.name = "Michael"
    val user2 = User(1,"Michael")
    println(user1 == user2)
    println("User Details : $user1")
    val updatedUser = user1.copy(name = "Beratcan Güreş")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // id:1
    println(updatedUser.component2()) // Beratcan Güreş

    val (id,name) = updatedUser
    println("id=$id name=$name")

}