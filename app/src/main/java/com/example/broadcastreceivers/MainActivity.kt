package com.example.broadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.broadcastreceivers.receivers.AirplaneModeReceiver

class MainActivity : AppCompatActivity() {
    lateinit var airplaneModeReceiver: AirplaneModeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        airplaneModeReceiver = AirplaneModeReceiver()

        // Dynamic Receivers
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).apply {
            registerReceiver(airplaneModeReceiver, this)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneModeReceiver)
    }
}