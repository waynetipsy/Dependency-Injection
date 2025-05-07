package app.ify.dependencyinjection

import javax.inject.Inject

class Car{
    // Dependency is created inside the class

    @Inject
    lateinit var engine: Engine

    fun drive(){
        println(engine.start())
    }
}