package com.mws.wisata

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLogin : Button
    private lateinit var txtRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)
        txtRegister = findViewById(R.id.txtRegister)
        txtRegister.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnLogin ->{
                    val login = Intent(this@MainActivity, DashboardActivity::class.java)
                    startActivity(login)
                }
            }
        }
        if (v != null) {
            when(v.id){
                R.id.txtRegister ->{
                    val register = Intent(this@MainActivity, RegisterActivity::class.java)
                    startActivity(register)
                }
            }
        }
    }
}

