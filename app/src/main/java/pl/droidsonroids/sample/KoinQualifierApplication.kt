package pl.droidsonroids.sample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.qualifier.named
import org.koin.dsl.module

class KoinQualifierApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@KoinQualifierApplication)
            modules(module {
                viewModel(named("A")) { SampleViewModel("A") }
                viewModel(named("B")) { SampleViewModel("B") }
            })
        }
    }
}

