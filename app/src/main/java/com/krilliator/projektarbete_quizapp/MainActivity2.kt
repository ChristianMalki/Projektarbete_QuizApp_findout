package com.krilliator.projektarbete_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

public class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val inputText = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.input)
        nextBtn.setOnClickListener {
            /*  if(inputText.text.toString(). isEmpty())
              {
                  Toast.makeText(this,"Enter Your Name",Toast.LENGTH_SHORT).show()
              }
              else{
                  var intent = Intent (this,QuestionActivity::class.java)
                  startActivity(intent)
                 // finish()
              } */
            val intent = Intent(this, QuestionActivity2::class.java)
            startActivity(intent)
        }
    }
}