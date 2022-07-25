package com.trunghaudinh.solid_principle.single_responsibility_principle

fun main() {
    val listDeveloper : MutableList<Employee> = mutableListOf()
    val developer = Developer("Trung Hau Dinh", 4,18,"Kotlin")
    val tester = Tester("Doan Thi Linh", 4,26,"Music Maker",100)
    val sale = Sale("Luong Van Thon", 4,30,69,100)
    listDeveloper.add(developer)
    listDeveloper.add(tester)
    listDeveloper.add(sale)

    val employee = listDeveloper[2]
    if (employee is Sale){
        employee.working()
        employee.totalMoney()
    }

}


abstract class Employee(
    private val name: String,
    private val exp: Int,
    private val age: Int
) {
    abstract fun working()
}

data class Developer(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val language: String
) : Employee(name, exp, age) {
    override fun working() {
        println("Developer $name code language $language")
    }
}

data class Tester(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val testSoftWare : String,
    private val totalBug: Int
) : Employee(name, exp, age) {
    override fun working() {
        println("Tester $name test app $testSoftWare")
    }

    fun totalBugsTested(){
        println("Tester $name tested $totalBug bugs")
    }
}

data class Sale(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val totalSoftWareSell: Int,
    private val money: Int
) : Employee(name, exp, age) {
    override fun working() {
        println("Sale $name sell $totalSoftWareSell software")
    }

    fun totalMoney() {
        println("Sale $name with total money = ${totalSoftWareSell.times(money)}")
    }
}