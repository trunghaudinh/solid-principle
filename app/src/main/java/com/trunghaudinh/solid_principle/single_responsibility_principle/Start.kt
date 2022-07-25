package com.trunghaudinh.solid_principle.single_responsibility_principle

fun main() {
    val developer = Employeee("Trung Hau Dinh", 4, 18, "Kotlin", typeEmploy = Employ.DEVELOP)
    val tester = Employeee(
        "Doan Thi Linh",
        4,
        26,
        testSoftWare = "Music Maker",
        totalBug = 100,
        typeEmploy = Employ.TESTER
    )
    val sale = Employeee(
        "Luong Van Thon",
        4,
        30,
        totalSoftWareSell = 69,
        money = 100,
        typeEmploy = Employ.SALE
    )

    val listDeveloper: MutableList<Employeee> = mutableListOf<Employeee>().apply {
        add(developer)
        add(tester)
        add(sale)
    }

    println(listDeveloper.toString())

}

data class Employeee(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val language: String = "",
    private val testSoftWare: String = "",
    private val totalBug: Int = 0,
    private val totalSoftWareSell: Int = 0,
    private val money: Int = 0,
    private val typeEmploy: Employ
) {
    fun working() {
        when (typeEmploy) {
            Employ.DEVELOP -> println("Developer $name code language $language")
            Employ.TESTER -> println("Tester $name test app $testSoftWare")
            Employ.SALE -> println("Sale $name sell $totalSoftWareSell software")
        }
    }

    fun totalBugsTested() {
        println("Tester $name tested $totalBug bugs")
    }

    fun totalMoney() {
        println("Sale $name with total money = ${totalSoftWareSell.times(money)}")
    }
}


enum class Employ {
    DEVELOP,
    TESTER,
    SALE
}
