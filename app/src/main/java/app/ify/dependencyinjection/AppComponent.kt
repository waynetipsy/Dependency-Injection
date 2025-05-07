package app.ify.dependencyinjection

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    // A component is like a bridge between the
   // modules(which provide the dependencies)
    // & the classes that need those dependencies

    // This interface defines the API for retrieving
    // the dependencies from the dagger Dep. graph
    fun inject(car: Car)
}