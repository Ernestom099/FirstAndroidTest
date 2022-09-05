package com.example.myapplication

import org.junit.*
import org.junit.Assert.assertEquals

class AssertionsUserAdultTest {
    private lateinit var bot: User
    private lateinit var jose: User
    @get :Rule
    val locationEsRule = LocationEsRule()

    @Before
    fun setup() {
        jose = User("Jose", 18, true)
        bot = User("My bot", 1, false)
    }

    @After
    fun tearDown() {
        bot = User()
    }

    @Test
    fun isAdult() {
        /* val assertions = Assertions()
         assertions.setLocation("MX")
         assertTrue(assertions.isAdult(jose)*/
        assertEquals(true, locationEsRule.assertions?.isAdult(jose))
        assertEquals(false, locationEsRule.assertions?.isAdult(bot))
    }

}