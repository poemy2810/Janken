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

        var hpPlayer = 5
        var hpCpu = 5

        progressBar_player.max = 5
        progressBar_player.progress = hpPlayer

        progressBar_cpu.max = 5
        progressBar_cpu.progress = hpCpu




        for (round in 1..5) {
            battleTime.text = "$round 戦目"

            val randomNum = Random().nextInt(3)


            val win: Int = 0
            val lose: Int = 0
            val draw: Int = 0



            choki.setOnClickListener {

                player_hand.setImageResource(R.drawable.choki_me)

                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "まけ！！！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"
                    progressBar_player.progress -= hpPlayer

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あなたのかち！！"

                    val win = win + 1
                    resultWin.text = "$win 勝"
                   // progressBar_cpu.secondaryProgress = 4

                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あいこ！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"
                }

            }


            gu.setOnClickListener {

                player_hand.setImageResource(R.drawable.gu_me)

                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "あいこ！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "まけ！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"

                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あなたのかち！！"
                    val win = win + 1
                    resultWin.text = "$win 勝"
                }
            }


            pa.setOnClickListener {

                player_hand.setImageResource(R.drawable.pa_me)
                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "あなたのかち！！"
                    val win = win + 1
                    resultWin.text = "$win 勝"

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あいこ！！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"
                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "まけ！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"

                }

            }

        }


    }
}




