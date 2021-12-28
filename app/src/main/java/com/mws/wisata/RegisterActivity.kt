package com.mws.wisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtLogin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtLogin = findViewById(R.id.txtLogin)
        txtLogin.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.txtLogin ->{
                    val login = Intent(this@RegisterActivity, MainActivity::class.java)
                    startActivity(login)
                }
            }
        }
    }
}