package com.example.demet.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.demet.smoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedbutton.setOnClickListener{
            val leaugeIntent = Intent(this, LeaugeActivity::class.java)
            startActivity(leaugeIntent)

        }
    }
}
