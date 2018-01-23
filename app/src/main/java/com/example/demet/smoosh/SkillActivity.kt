package com.example.demet.smoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

     var leauge = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leauge = intent.getStringExtra(EXTRA_LEAUGE)
    }
}
