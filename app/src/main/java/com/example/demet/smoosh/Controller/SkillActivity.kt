package com.example.demet.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demet.smoosh.Utilities.EXTRA_LEAUGE
import com.example.demet.smoosh.R
import com.example.demet.smoosh.Utilities.EXTRA_Skill
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

     var leauge = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leauge = intent.getStringExtra(EXTRA_LEAUGE)
    }

    fun onbeginnerClicked(view : View){
        ballerSkilledBtn.isChecked = false;
        skill = "beginner"
    }
    fun onballerClicked(view : View){
        beginnerSkilledBtn.isChecked = false;
        skill = "baller"

    }


    fun onclickedFinishedClicked(view : View){
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAUGE, leauge)
            finishActivity.putExtra(EXTRA_Skill, skill)
            startActivity(finishActivity)
        }else{

            Toast.makeText(this, "Select a Skill",Toast.LENGTH_SHORT)
        }
    }
}
