package com.trunghaudinh.solid_principle.interface_segregation_principle

fun main() {

}

interface Animal {
    fun eat()
    fun run()
    fun fly()
}

interface RunnableAnimal : Animal {
}


interface FlyableAnimal : Animal {

}


/*-------------------*/

interface Employee {
    fun createReport()
    fun checkIn()
    fun checkOut()
    fun doWork()
    fun getPaid()
}

interface NormalEmployee : Employeee {
    fun checkIn()
    fun checkOut()
}

interface Management : Employeee {
    fun createReport()
}

interface Employeee {
    fun doWork()
    fun getPaid()
}

class Staff : NormalEmployee {
    override fun checkIn() {
    }

    override fun checkOut() {
    }

    override fun doWork() {
    }

    override fun getPaid() {
    }

}

class Manager : Management {
    override fun createReport() {
    }

    override fun doWork() {
    }

    override fun getPaid() {
    }

}