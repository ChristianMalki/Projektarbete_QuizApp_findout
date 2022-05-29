package com.krilliator.projektarbete_quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var score: Int = getIntent().extras!!.getInt("score")

        var finalScore: TextView = findViewById(R.id.finalScore)
        finalScore.setText("Final score: " + score.toString())
    }

}