package com.krilliator.projektarbete_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextBtn= findViewById<Button>(R.id.nextBtn)
        val inputText=findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.input)
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
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
        }
        //Where all the question are
        val quizList = arrayListOf<QuestionData>()
        quizList.add(
            QuestionData(
                "Which car does Timothy Dalton driving way to fast in icy mission 1987?",
                1,
                "1957",
                "Aston Martin V8 Vantage",
                "Lotus Espirit",
                "Volvo 142",
                "2",
            )
        )
        quizList.add(
            QuestionData(
                "Which James Bond actor ended up on People Magazine's list of the sexiest man alive at the age of 48?",
                2,
                "Daniel Craig",
                "Pierce Brosnan",
                "Timothy Dalton",
                "Christian Malki",
                "2",
            )
        )
        quizList.add(
            QuestionData(
                "Which Småland Bond bride was chosen for Miss Sweden in 1970 and played against Roger Moore in Octopussy in 1983?",
                3,
                "Maud Adams",
                "Kristina Wayborn",
                "Izabella Scorupco",
                "Sissel Björnenak",
                "2",
            )
        )
        quizList.add(
            QuestionData(
                "Grace Jones plays a mysterious henchman in live target from 1985, which Swede did Jones have a glowing relationship with during the 80's?",
                4,
                "Stellan Skarsgård",
                "Lassa Hallström",
                "Dolph Lundgren",
                "Saiman Chen",
                "3",
            )
        )
        quizList.add(
            QuestionData(
                "Which of the following actors was considered for the role of the Joker in Suicide Squad?",
                5,
                "Ryan Gosling",
                "Jack Black",
                "Rachel McAdams",
                "Kristoffer Johansson",
                "3",
            )
        )
        quizList.add(
            QuestionData(
                "What character does James Gunn consider to be the heart of The Suicide Squad?",
                6,
                "Ratcatcher 2",
                "King Shark",
                "Peacemaker",
                "Johan Näsvall",
                "1",
            )
        )
        quizList.add(
            QuestionData(
                "Which of the characters in The Suicide Squad will soon have his series of James Gunn?",
                7,
                "Harley Quinn",
                "Peacemaker",
                "Rick Flag",
                "Francisco Andresson",
                "3",
            )
        )
        quizList.add(
            QuestionData(
                "When did the first fast and furious movie come out?",
                8,
                "2001",
                "2000",
                "2002",
                "2003",
                "1",
            )
        )
        quizList.add(
            QuestionData(
                "How many of the films did Paul Walker take part in?",
                9,
                "Seven films",
                "Five films",
                "Six films",
                "Eight films",
                "3",
            ))}
}




