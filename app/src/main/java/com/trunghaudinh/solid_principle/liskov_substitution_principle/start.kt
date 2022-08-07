package com.trunghaudinh.solid_principle.liskov_substitution_principle

fun main() {

}

interface Animal {
    fun fly()
}

interface FlyableAnimal{
    fun fly()
}

class Hawk : Animal {
    override fun fly() {
        println("Hawk can fly")
    }
}

class Dog : Animal {
    override fun fly() {
        throw Exception("Penguin can't fly")
    }
}