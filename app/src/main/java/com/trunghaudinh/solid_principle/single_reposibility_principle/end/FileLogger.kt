package com.trunghaudinh.solid_principle.single_reposibility_principle.end

import java.io.File

class FileLogger {
    fun logErrorUser(name: String) {
        val file = File("logger.txt")
        file.appendText("insert user $name error")
        println("insert user $name error")
    }
}