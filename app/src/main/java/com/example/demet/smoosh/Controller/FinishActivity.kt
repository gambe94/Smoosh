package com.example.demet.smoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.demet.smoosh.R
import com.example.demet.smoosh.Utilities.EXTRA_PLAYER
import com.example.demet.smoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaugesText.text = "Loking for ${player.leauge} ${player.skill} leauge near you..."
    }
}
