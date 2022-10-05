package com.udemy.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btn = findViewById(R.id.getStartedBtn) as Button
        btn.setOnClickListener {
            val leagueIntent = Intent (this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}