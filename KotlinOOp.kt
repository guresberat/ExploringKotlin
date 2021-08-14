package com.example.helloworld

fun main(){
    //var berat = Person("Beratcan", "Güreş")
    //var john = Person()
    //var johnPeterson = Person(lastName = "Peterson")

    var phone1 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    //var phone2 = MobilePhone("Android", "Huawei", "P20")
    //var phone3 = MobilePhone("Ios", "Apple", "6s")

    phone1.chargeBattery(30)

}

class Person(firstName: String = "John", lastName: String = "Doe"){
    init{
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
}

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("Initialized a new MobilePhone object with " +
                "osName = $osName , brand = $brand , model = $model")
    }
    var battery: Int = 28

    fun chargeBattery(charge: Int){
        println("Battery before charge = $battery")
        println("How much it is charged $charge")
        println("How much it has now ${charge+battery}")
        battery += charge
    }
}

