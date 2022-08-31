package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest {

    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        //val array = arrayOf(2, 71)//valor esperado
        val array = arrayOf(2, 7)//valor esperado
        assertArrayEquals("mensaje personalizado de error en testing",array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Luis"
        val otherName = "Juan"
        assertEquals(name,assertions.getName())
        assertNotEquals(otherName,assertions.getName())
    }
}