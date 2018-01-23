package com.example.demet.smoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeaugeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }

    fun leaugeNextClicked(view: View){
        val skilIntent = Intent(this, SkillActivity::class.java)
        startActivity(skilIntent)

    }
}
