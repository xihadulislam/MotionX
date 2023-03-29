package com.xihadulislam.motionx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.xihadulislam.motionx.profile.TelegramProfileActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick.setOnClickListener {
            startActivity(Intent(this, TelegramProfileActivity::class.java))
        }

    }
}