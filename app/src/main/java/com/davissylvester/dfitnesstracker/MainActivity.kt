package com.davissylvester.dfitnesstracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showContactInfo(view: View) {

        val intent = Intent(this, trainerContactInfo::class.java)

        startActivity(intent)
    }
}
