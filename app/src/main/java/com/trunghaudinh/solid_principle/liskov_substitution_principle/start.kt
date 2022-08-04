package com.trunghaudinh.solid_principle.liskov_substitution_principle

fun main() {

}

interface Bird {
    fun fly()
}

class Hawk : Bird {
    override fun fly() {
        println("Hawk can fly")
    }
}

class Penguin : Bird {
    override fun fly() {
        throw Exception("Penguin can't fly")
    }
}