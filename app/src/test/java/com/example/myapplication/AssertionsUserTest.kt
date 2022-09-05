package com.example.myapplication

import org.junit.*
import org.junit.Assert.*

class AssertionsUserTest {

    private lateinit var bot: User

    companion object {
        private lateinit var jose: User

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            jose = User("Jose", 31, true)
            println("Before Class")
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            jose = User()
            println("TearComon Class")
        }
    }

    @Before
    fun setup() {
        bot = User("My bot", 1, false)
        println("Before")
    }

    @After
    fun tearDown() {
        bot = User()
        println("After")
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(jose))
        println("checkHumanTest")
    }

    @Test
    fun checkNullUserTest() {
        val user = null
        assertNull(user)
        println("checkNullUserTest")
    }

    @Test
    fun checkNotNullUserTest() {
        assertNotNull(jose)
        println("checkNotNullUserTest")
    }


    @Test
    fun checkNotSameUserTest() {
        assertNotSame(bot, jose)
        println("checkNotSameUserTest")
    }

    @Test
    fun checkSameUserTest() {
        val copyjose = jose
        assertSame(copyjose, jose)
        println("checkSameUserTest")
    }

}