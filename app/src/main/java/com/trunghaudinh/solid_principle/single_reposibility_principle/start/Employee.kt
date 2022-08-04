package com.trunghaudinh.solid_principle.single_reposibility_principle.start

import java.io.File

data class Employee(
    private val name: String,
    private val exp: Int,
    private val age: Int,
    private val user: String,
    private val password: String
) {

    fun saveUser() {
        // check invalid
        if (user.length > 6 && password.length > 6) {
            // save user
        } else {
            val file = File("logger.txt")
            file.appendText("insert user $user error")
        }
    }
}