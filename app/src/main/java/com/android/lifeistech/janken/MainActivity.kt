package com.android.lifeistech.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        //Player,CPUのHPを設定


        val win: Int = 0
        val lose: Int = 0
        val draw: Int = 0
        //勝ち数、負け数、引き分け数の初期値を設定

        val round: Int = 0




        while (win < 4 || lose < 4) {
            val round = round +1
            battleTime.text = "$round 戦目"
            //何戦目なのか表示

            val randomNum: Int = Random().nextInt(3)
            //ランダムな数を生成、コンピュータの出し手を決める


            //0:"グー"
            //1:"パー"
            //2:"チョキ"
            choki.setOnClickListener {

                player.setImageResource(R.drawable.choki_me)

                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "まけ！！！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"
                    progressBar_player.progress = hpPlayer - 1

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あなたのかち！！"

                    val win = win + 1
                    resultWin.text = "$win 勝"
                    progressBar_cpu.progress = hpCpu - 1


                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あいこ！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"
                }

            }


            gu.setOnClickListener {

                player.setImageResource(R.drawable.gu_me)

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
                    progressBar_player.progress = hpPlayer - 1

                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "あなたのかち！！"
                    val win = win + 1
                    resultWin.text = "$win 勝"
                    progressBar_cpu.progress = hpCpu - 1
                }
            }


            pa.setOnClickListener {

                player.setImageResource(R.drawable.pa_me)
                if (randomNum == 0) {
                    //相手の手がグーの時
                    cpu.setImageResource(R.drawable.gu_aite)
                    resultThisTime.text = "あなたのかち！！"
                    val win = win + 1
                    resultWin.text = "$win 勝"
                    progressBar_cpu.progress = hpCpu - 1

                } else if (randomNum == 1) {
                    //相手の手がパーの時
                    cpu.setImageResource(R.drawable.pa_aite)
                    resultThisTime.text = "あいこ！！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"
                } else {
                    //相手の手がチョキの時
                    cpu.setImageResource(R.drawable.choki_aite)
                    resultThisTime.text = "まけ！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"
                    progressBar_player.progress = hpPlayer - 1

                }

            }


            /*
        gu.setOnClickListener(listener)
        pa.setOnClickListener(listener)
        choki.setOnClickListener(listener)

        */

        }
    }
}
/*
    val listener = object : View.OnClickListener {
        override fun onClick(v: View?) {

            var hands = IntArray(3)

            hands[0] = R.drawable.gu_me
            hands[1] = R.drawable.choki_me
            hands[2] = R.drawable.pa_me

            var handsCpu = IntArray(3)
            handsCpu[0] = R.drawable.gu_aite
            handsCpu[1] = R.drawable.choki_aite
            handsCpu[2] = R.drawable.pa_aite


            val round: Int = 0

            var hand = 0
            if (v == findViewById(R.id.gu)) {
                hand = 0
            } else if (v == findViewById((R.id.choki))) {
                hand = 1
            } else if (v == findViewById(R.id.pa)) {
                hand = 2
            }


            var hpPlayer = 5
            var hpCpu = 5

            progressBar_player.max = 5
            progressBar_player.progress = hpPlayer

            progressBar_cpu.max = 5
            progressBar_cpu.progress = hpCpu
            //Player,CPUのHPを設定


            val win: Int = 0
            val lose: Int = 0
            val draw: Int = 0
            //勝ち数、負け数、引き分け数の初期値を設定

            while (win < 4 || lose < 4) {
                val random = Random().nextInt(3)
                player.setImageResource(hands[hand])
                cpu.setImageResource(handsCpu[random])


                val shouhai = hand - random + 3




                if (shouhai % 3 == 0) {
                    resultThisTime.text = "あいこ！！！！"
                    val draw = draw + 1
                    resultDraw.text = "$draw 引き分け"

                } else if (shouhai % 3 == 1) {
                    resultThisTime.text = "まけ！！！！"
                    val lose = lose + 1
                    resultLose.text = "$lose 敗"
                    progressBar_player.progress = hpPlayer - 1

                } else if (shouhai % 3 == 2) {
                    resultThisTime.text = "あなたのかち！！"
                    val win = win + 1
                    resultWin.text = "$win 勝"
                    progressBar_cpu.progress = hpCpu - 1

                }
            }
        }*/







