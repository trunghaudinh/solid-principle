package com.trunghaudinh.solid_principle.single_reposibility_principle.end

import java.sql.Connection

class DBHelper {
    fun openConnection(): Connection? {
        return null
    }

    fun saveEmployee(user: Employee?) {}

    fun getProducts(): List<Product> {
        return emptyList()
    }

    fun closeConnection() {}
}

class Product {

}

/*=====================*/

class DBConnection {
//    fun openConnection(): Connection {}
    fun closeConnection() {}
}

class EmployeeRepository {
    fun saveEmployee(user: Employee?) {}
}

class ProductRepository {
    fun getProducts(): List<Product> {
        return emptyList()
    }
}
