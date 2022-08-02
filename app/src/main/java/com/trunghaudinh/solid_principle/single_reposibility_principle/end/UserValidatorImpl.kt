package com.trunghaudinh.solid_principle.single_reposibility_principle.end

class UserValidatorImpl : Validator {
    override fun isValid(user: String, password: String): Boolean {
        return user.length > 6 && password.length > 6
    }
}