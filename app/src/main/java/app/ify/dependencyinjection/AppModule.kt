package app.ify.dependencyinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


// Hilt Module: define how dependencies are provided
@Module //Marks the class as a module for Dependency provisioning
@InstallIn(SingletonComponent::class)


object AppModule {

    @Provides //tells hilt how to provide an object
    @Singleton //Ensures that Hilt provides a single instance
    fun provideEngine(): Engine {
      return Engine()  //Single instance of Engine
    }

    @Provides
    @Singleton
    fun provideCar(engine: Engine):Car {
        return Car(engine)
    }
}