package com.example.myapplication

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class LocationEsRule : TestRule {

    var assertions: Assertions? = null

    override fun apply(base: Statement?, description: Description?): Statement {
        return object : Statement() {
            override fun evaluate() {
                assertions = Assertions()
                assertions?.setLocation("ES")
                try {
                    base?.evaluate()
                } finally {
                    assertions = null
                }
            }
        }
    }
}