package com.example.demet.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demet.smoosh.Utilities.EXTRA_LEAUGE
import com.example.demet.smoosh.R
import kotlinx.android.synthetic.main.activity_leauge.*

class LeaugeActivity : BaseActivity() {

    var selectedLeauge = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }

    fun onMensClicked(view : View){
        womeLeaugeBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        selectedLeauge = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeaugeBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        selectedLeauge = "womens"
    }
    fun onCoedClicked(view: View){
        mensLeaugeBtn.isChecked = false
        womeLeaugeBtn.isChecked = false
        selectedLeauge = "co-ed"
    }

    fun leaugeNextClicked(view: View){
        if(selectedLeauge != "") {
            val skilIntent = Intent(this, SkillActivity::class.java)
            skilIntent.putExtra(EXTRA_LEAUGE, selectedLeauge)
            startActivity(skilIntent)
        }else{
            Toast.makeText(this,"Choose a leauge", Toast.LENGTH_SHORT)

        }

    }


}
