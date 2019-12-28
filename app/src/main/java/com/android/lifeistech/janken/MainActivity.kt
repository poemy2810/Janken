package com.android.lifeistech.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        choki.setOnClickListener {

            player_hand.setImageResource(R.drawable.choki_me)
            val randomNum = Random().nextInt(3)

            if (randomNum == 0) {
                //相手の手がグーの時
                cpu.setImageResource(R.drawable.gu_aite)
                resultThisTime.text = "あなたのまけです"

            }else if(randomNum == 1){
                //相手の手がパーの時
                cpu.setImageResource(R.drawable.pa_aite)
                resultThisTime.text = "あなたのかちです"
            }else{
                //相手の手がチョキの時
                cpu.setImageResource(R.drawable.choki_aite)
                resultThisTime.text = "あいこ！"
            }





        }
    }




}
