package com.example.myapplication

class Assertions {

    private val user = User("Luis", 25)
    private var location = "US"

    fun setLocation(location: String) {
        this.location = location
    }

    fun getLuckyNumbers(): Array<Int> {
        return arrayOf(2, 7)
    }

    fun getName(): String {
        return user.name
    }


    fun checkHuman(user: User): Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User? = null): Boolean? {
        if (user == null) {
            return null
        }
        return user.isHuman
    }

    fun isAdult(user: User): Boolean {
        if (!user.isHuman) {
            return true
        }

        return if (location == "US") user.age >= 21
        else user.age >= 18
    }
}