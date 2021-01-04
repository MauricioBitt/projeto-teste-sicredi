package com.sicredi.sicreditestapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.sicredi.sicreditestapp.R
import com.sicredi.sicreditestapp.ui.eventlist.EventListActivity


class SplashActivity : AppCompatActivity() {

    private val splashTimeout : Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        val handler = Handler()
        handler.postDelayed(Runnable { showEventsActivity() }, splashTimeout)
    }

    private fun showEventsActivity() {
        val intent = Intent(this@SplashActivity, EventListActivity::class.java)
        startActivity(intent)
        finish()
    }
}