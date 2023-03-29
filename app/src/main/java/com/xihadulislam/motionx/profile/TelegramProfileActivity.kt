package com.xihadulislam.motionx.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xihadulislam.motionx.R

class TelegramProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telegram_profile)
        supportActionBar?.hide()
    }
}