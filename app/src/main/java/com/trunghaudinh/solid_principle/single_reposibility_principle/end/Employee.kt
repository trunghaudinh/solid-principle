package com.trunghaudinh.solid_principle.single_reposibility_principle.end

fun main() {
    val logger = FileLogger()
    val validatorUser = UserValidatorImpl()

    val employee = Employee("trung hau", 1, 18, "trunghaudinh", "1231232", logger, validatorUser)
    employee.saveUser()
}

data class Employee(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val user: String,
    private val password: String,
    private val logger: FileLogger,
    private val validator: Validator
) {

    fun saveUser() {
        if (validator.isValid(user, password)) {
            // save user
            println("save user $user success")
        } else {
            logger.logErrorUser(user)
        }
    }
}

