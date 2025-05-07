package app.ify.dependencyinjection

fun main(){
    val engine = Engine()

    // Dependency is Injected Here
    val car = Car(engine)
    car.drive()
}