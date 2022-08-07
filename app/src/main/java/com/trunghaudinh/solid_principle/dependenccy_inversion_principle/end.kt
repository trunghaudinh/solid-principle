package com.trunghaudinh.solid_principle.dependenccy_inversion_principle

fun main() {

    val vinFastWheel = VinFastWheel()
    val dieselEngine = DieselEngine()

    val dieselCar = Car(vinFastWheel, dieselEngine)
    dieselCar.build()

    val bmwWheel = BmwWheel()
    val electricEngine = ElectricEngine()

    val electricCar = Car(bmwWheel, electricEngine)
    electricCar.build()

}

interface Wheel {

}

interface Engine {

}

class DieselEngine : Engine {
}

class ElectricEngine : Engine {
}

class VinFastWheel : Wheel {
}

class BmwWheel : Wheel {
}

class Car(
    private val wheel: Wheel,
    private val engine: Engine
) {
    fun build() {
        // engine of car = engine
        // wheel of car = wheel
    }
}