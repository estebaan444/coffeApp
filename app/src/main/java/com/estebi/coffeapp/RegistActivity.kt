package com.estebi.coffeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
        val btn: Button = findViewById(R.id.buttonSig3)
        val btnLog: Button = findViewById(R.id.buttonSigOn)

        btn.setOnClickListener {
            val intent = Intent(this, SingInActivity  ::class.java)
            startActivity(intent)
        }
        btnLog.setOnClickListener {
            val intent = Intent(this, SingInActivity  ::class.java)
            startActivity(intent)
        }
    }
}