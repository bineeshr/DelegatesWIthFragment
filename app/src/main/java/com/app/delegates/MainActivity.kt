package com.app.delegates

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = FirstFragment.newInstance("I am Bineesh R")
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment).commitAllowingStateLoss()
    }
}
