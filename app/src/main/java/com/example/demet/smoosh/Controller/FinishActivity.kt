package com.example.demet.smoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.demet.smoosh.R
import com.example.demet.smoosh.Utilities.EXTRA_LEAUGE
import com.example.demet.smoosh.Utilities.EXTRA_Skill
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val leauge = intent.getStringExtra(EXTRA_LEAUGE)
        val skill= intent.getStringExtra(EXTRA_Skill)

        searchLeaugesText.text = "Loking for $leauge $skill leauge near you..."
    }
}
