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


        for (battle in 1..5) {
            val randomNum = Random().nextInt(3)

            choki.setOnClickListener {

                player_hand.setImageResource(R.drawable.choki_me)

                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "まけ！！！！"

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あなたのかち！！"
                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あいこ！"
                }

            }


            gu.setOnClickListener {

                player_hand.setImageResource(R.drawable.gu_me)

                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "あいこ！"

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "まけ！！"
                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あなたのかち！！"
                }
            }


            pa.setOnClickListener {

                player_hand.setImageResource(R.drawable.pa_me)
                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "あいこ！"
                    resultThisTime.textColors

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あなたのかち！！"
                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "まけ！！"
                }
            }


        }
    }




}
