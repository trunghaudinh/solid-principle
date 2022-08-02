package com.trunghaudinh.solid_principle.single_reposibility_principle.end

interface Validator {
    fun isValid(user: String, password: String): Boolean
}