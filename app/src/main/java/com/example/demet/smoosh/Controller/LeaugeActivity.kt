package com.example.demet.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demet.smoosh.R
import com.example.demet.smoosh.Utilities.EXTRA_PLAYER
import com.example.demet.smoosh.model.Player
import kotlinx.android.synthetic.main.activity_leauge.*

class LeaugeActivity : BaseActivity() {

    var selectedLeauge = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }

    fun onMensClicked(view : View){
        womeLeaugeBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.leauge = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeaugeBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.leauge = "womens"
    }
    fun onCoedClicked(view: View){
        mensLeaugeBtn.isChecked = false
        womeLeaugeBtn.isChecked = false
        player.leauge = "co-ed"
    }

    fun leaugeNextClicked(view: View){
        if(  player.leauge != "") {
            val skilIntent = Intent(this, SkillActivity::class.java)
            skilIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skilIntent)
        }else{
            Toast.makeText(this,"Choose a leauge", Toast.LENGTH_SHORT)

        }

    }


}
