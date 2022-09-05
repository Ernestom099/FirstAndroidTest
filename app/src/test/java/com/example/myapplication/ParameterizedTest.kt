package com.example.myapplication

import org.junit.*
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(val currentValue: Boolean, var currentUser: User) {
     @get :Rule
    val locationEsRule = LocationEsRule()

    companion object {
        var assertions: Assertions? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            assertions = Assertions()
        }

        @AfterClass
        @JvmStatic
        fun tearDown() {
            assertions = null
        }

        @Parameterized.Parameters
        @JvmStatic
        fun getUserUS() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(true, User("Bot 21", 4,false)),
            arrayOf(false, User("Alex", 18))
        )

        @Parameterized.Parameters
        @JvmStatic
        fun getUserES() = arrayOf(
            arrayOf(true, User("Pedro", 19)),
            arrayOf(false, User("Clara", 14)),
            arrayOf(true, User("Bot 21", 4,false)),
            arrayOf(true, User("Alex", 18))
        )

    }

    @Test
    fun isAdult() {
     //   assertEquals(currentValue, assertions?.isAdult(currentUser))
        assertEquals(currentValue,locationEsRule.assertions?.isAdult(currentUser))
    }

}