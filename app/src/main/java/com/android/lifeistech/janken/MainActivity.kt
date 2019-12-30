package com.android.lifeistech.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retryButton.visibility = INVISIBLE


        progressBar_player.max = 5
        progressBar_player.progress = 5

        progressBar_cpu.max = 5
        progressBar_cpu.progress = 5
        //Player,CPUのHPを設定


        var win: Int = 0
        var lose: Int = 0
        var draw: Int = 0
        //勝ち数、負け数、引き分け数の初期値を設定

        var round: Int = 0

        fun turnEnd(){


            if(win == 5 ){
                Toast.makeText(applicationContext,"この勝負、あなたの勝ち！",Toast.LENGTH_LONG).show()

                retryButton.visibility = VISIBLE

                retryButton.setOnClickListener {
                    win = 0
                    lose = 0
                    draw = 0
                    round = 0

                    resultWin.text = "$win 勝"
                    resultLose.text = "$lose 敗"
                    resultDraw.text = "$draw 引き分け"
                    battleTime.text = "$round 戦目"

                    progressBar_player.progress = 5
                    progressBar_cpu.progress = 5

                    retryButton.visibility = INVISIBLE
                }


            }

            if(lose == 5){

                retryButton.visibility = VISIBLE
                Toast.makeText(applicationContext,"残念、あなたの負けです…。",Toast.LENGTH_LONG).show()

                retryButton.setOnClickListener {
                    win = 0
                    lose = 0
                    draw = 0
                    round = 0

                    resultWin.text = "$win 勝"
                    resultLose.text = "$lose 敗"
                    resultDraw.text = "$draw 引き分け"
                    battleTime.text = "$round 戦目"

                    progressBar_player.progress = 5
                    progressBar_cpu.progress = 5

                    retryButton.visibility = INVISIBLE
                }

            }



        }



            //0:"グー"
            //1:"パー"
            //2:"チョキ"
        choki.setOnClickListener {


            player.setImageResource(R.drawable.choki_me)
            val randomNum: Int = Random().nextInt(3)
            round++
            battleTime.text = "$round 戦目"
            //何戦目なのか表示

            if (randomNum == 0) {
                    //相手の手がグーの時
                cpu.setImageResource(R.drawable.gu_aite)
                resultThisTime.text = "まけ！！！！"
                lose++
                resultLose.text = "$lose 敗"
                progressBar_player.progress -= 1

            } else if (randomNum == 1) {
                //相手の手がパーの時
                cpu.setImageResource(R.drawable.pa_aite)
                resultThisTime.text = "あなたのかち！！"
                win++
                resultWin.text = "$win 勝"
                progressBar_cpu.progress -= 1


            } else {
                //相手の手がチョキの時
                cpu.setImageResource(R.drawable.choki_aite)
                resultThisTime.text = "あいこ！"
                draw++
                resultDraw.text = "$draw 引き分け"
            }

            val end = turnEnd()

        }


        gu.setOnClickListener {

            round++
            battleTime.text = "$round 戦目"
            //何戦目なのか表示
            player.setImageResource(R.drawable.gu_me)
            val randomNum: Int = Random().nextInt(3)

            if (randomNum == 0) {
                    //相手の手がグーの時
                cpu.setImageResource(R.drawable.gu_aite)
                resultThisTime.text = "あいこ！"
                draw++
                resultDraw.text = "$draw 引き分け"
            } else if (randomNum == 1) {
                //相手の手がパーの時
                cpu.setImageResource(R.drawable.pa_aite)
                resultThisTime.text = "まけ！！"
                lose++
                resultLose.text = "$lose 敗"
                progressBar_player.progress -= 1

            } else {
                //相手の手がチョキの時
                cpu.setImageResource(R.drawable.choki_aite)
                resultThisTime.text = "あなたのかち！！"
                win++
                resultWin.text = "$win 勝"
                progressBar_cpu.progress -= 1
            }

            val end = turnEnd()
        }


        pa.setOnClickListener {

            round++
            battleTime.text = "$round 戦目"
            //何戦目なのか表示
            player.setImageResource(R.drawable.pa_me)
            val randomNum: Int = Random().nextInt(3)
            if (randomNum == 0) {
                //相手の手がグーの時
                cpu.setImageResource(R.drawable.gu_aite)
                resultThisTime.text = "あなたのかち！！"
                win++
                resultWin.text = "$win 勝"
                progressBar_cpu.progress -= 1
            } else if (randomNum == 1) {
                //相手の手がパーの時
                cpu.setImageResource(R.drawable.pa_aite)
                resultThisTime.text = "あいこ！！"
                draw++
                resultDraw.text = "$draw 引き分け"
            } else {
                //相手の手がチョキの時
                cpu.setImageResource(R.drawable.choki_aite)
                resultThisTime.text = "まけ！！"
                lose++
                resultLose.text = "$lose 敗"
                progressBar_player.progress -= 1

            }

            val end = turnEnd()


        }

    }
}








