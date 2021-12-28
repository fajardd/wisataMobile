package com.mws.wisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgFood : ImageButton
    private lateinit var imgBatik : ImageButton
    private lateinit var imgTujuan : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        imgFood = findViewById(R.id.imgFood)
        imgFood.setOnClickListener(this)
        imgBatik = findViewById(R.id.imgBatik)
        imgBatik.setOnClickListener(this)
        imgTujuan = findViewById(R.id.imgTujuan)
        imgTujuan.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, FragmentActivity::class.java)
//        val data = Bundle()
//        data.putString("message", "Ini isi dari bundle")
//        intent.putExtras(data)
        startActivity(intent)
    }
    
    
}
