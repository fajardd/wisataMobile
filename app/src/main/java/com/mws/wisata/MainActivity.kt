package com.mws.wisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, DashboardActivity::class.java)
//        val data = Bundle()
//        data.putString("message", "Ini isi dari bundle")
//        intent.putExtras(data)
        startActivity(intent)
    }
}