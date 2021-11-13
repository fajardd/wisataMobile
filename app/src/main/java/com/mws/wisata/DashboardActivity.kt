package com.mws.wisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        imgBtn = findViewById(R.id.imgBtn)
        imgBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, FragmentActivity::class.java)
//        val data = Bundle()
//        data.putString("message", "Ini isi dari bundle")
//        intent.putExtras(data)
        startActivity(intent)
    }
}