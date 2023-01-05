package pl.droidsonroids.sample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : ComponentActivity() {

    private val vm1 by viewModel<SampleViewModel>(named("A"))
    private val vm2 by viewModel<SampleViewModel>(named("B"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("koin","vm1: $vm1 ${vm1.label}")
        Log.e("koin","vm2: $vm2 ${vm2.label}")
    }
}

