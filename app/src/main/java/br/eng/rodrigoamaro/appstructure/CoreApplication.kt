package br.eng.rodrigoamaro.appstructure

import android.app.Application
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CoreApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CoreApplication)
            // Core Modules
            modules(StructureModule.INSTANCE)
        }

        getKoin().get<ApplicationSetup>().run()

    }
}