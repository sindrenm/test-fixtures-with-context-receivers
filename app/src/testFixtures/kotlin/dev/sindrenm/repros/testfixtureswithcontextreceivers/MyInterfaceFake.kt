package dev.sindrenm.repros.testfixtureswithcontextreceivers

class MyInterfaceFake : MyInterface {
    context(Scope) // FIXME: Android Studio complains about this line, but it's actually fine
    override fun runsInsideScope() = Unit
}