package com.example.broadcastreceivers.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra(EXTRA_AIRPLANE_MODE, false) ?: return
        if (isAirplaneModeEnabled) {
            Log.d(TAG, "Airplane Mode Enabled")

        } else {
            Log.d(TAG, "Airplane Mode Disabled")
        }
    }

    companion object {
        const val TAG = "AirplaneModeReceiver"
        const val EXTRA_AIRPLANE_MODE = "state"
    }
}