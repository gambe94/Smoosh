package com.example.demet.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demet.smoosh.R
import com.example.demet.smoosh.Utilities.EXTRA_PLAYER
import com.example.demet.smoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player :Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER);
    }

    fun onbeginnerClicked(view : View){
        ballerSkilledBtn.isChecked = false;
        player.skill = "beginner"
    }
    fun onballerClicked(view : View){
        beginnerSkilledBtn.isChecked = false;
        player.skill = "baller"

    }


    fun onclickedFinishedClicked(view : View){
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player);
            startActivity(finishActivity)
        }else{

            Toast.makeText(this, "Select a Skill",Toast.LENGTH_SHORT)
        }
    }
}
