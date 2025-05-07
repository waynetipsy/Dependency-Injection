package app.ify.dependencyinjection

fun main(){
    // Hilt/Dagger generates the DaggerAppComponent
    // class at compile-time
    val appComponent : AppComponent = DaggerAppComponent.create()

    //Retrieve the car instance
    var car = Car()

    // Inject Dependencies into the Car's Fields
    appComponent.inject(car)
}