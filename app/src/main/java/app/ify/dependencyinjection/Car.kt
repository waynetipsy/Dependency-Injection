package app.ify.dependencyinjection

class Car(private val engine: Engine){
    // Dependency is created inside the class
    // problem: The car class creates its own Engine
    //private val engine = Engine()

    fun drive(){
        println(engine.start())
    }
}