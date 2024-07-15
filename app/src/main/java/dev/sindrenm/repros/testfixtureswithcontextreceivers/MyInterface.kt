package dev.sindrenm.repros.testfixtureswithcontextreceivers

class Scope

interface MyInterface {
    context(Scope)
    fun runsInsideScope()
}

class MyInterfaceImpl : MyInterface {
    context(Scope)
    override fun runsInsideScope() = Unit
}

