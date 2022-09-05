package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest {

    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        //val array = arrayOf(2, 71)//valor esperado
        val array = arrayOf(2, 7)//valor esperado
        assertArrayEquals(
            "mensaje personalizado de error en testing",
            array,
            assertions.getLuckyNumbers()
        )
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val name = "Luis"
        val otherName = "Juan"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }



    @Test(timeout = 1_000)
    fun getCitiesTest() {
        val cities = arrayOf("Mexico", "Colombia", "UK")
        Thread.sleep(Random.nextLong(200, 1_100))
        //Thread.sleep(Random.nextLong(1_200, 3_100))
        assertEquals(3, cities.size)
    }
}