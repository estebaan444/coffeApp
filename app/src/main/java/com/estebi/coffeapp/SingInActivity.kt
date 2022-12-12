package com.estebi.coffeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)
        val btn: Button = findViewById(R.id.buttonSig2)
        val btnReg: Button = findViewById(R.id.buttonSigOn)
        btn.setOnClickListener {
            val intent = Intent(this, init::class.java)
            startActivity(intent)
        }
        btnReg.setOnClickListener {
            val intent = Intent(this, RegistActivity::class.java)
            startActivity(intent)
        }
    }
}