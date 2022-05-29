package com.krilliator.projektarbete_quizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.krilliator.projektarbete_quizapp.R.id.*

class QuestionActivity : AppCompatActivity() {
    lateinit var textScore:TextView
    val que = arrayListOf<QuestionData>()
    var hasAnswered: Boolean = false
    var questionsLeft: Int = 0
    var index: Int = 0
    private var questionList: ArrayList<QuestionData>? = null
    var score: Int=0
    lateinit var quetext: TextView
    lateinit var opt_1: TextView
    lateinit var opt_2: TextView
    lateinit var opt_3: TextView
    lateinit var opt_4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // Where all the questions are
        textScore = findViewById(R.id.textScore)
        que.add(
            QuestionData(
                "Which car does Timothy Dalton driving way to fast in icy mission 1987?",
                1,
                "1957",
                "Aston Martin V8 Vantage",
                "Lotus Espirit",
                "Volvo 142",
                "Aston Martin V8 Vantage",
            )
        )
        que.add(
            QuestionData(
                "Which James Bond actor ended up on People Magazine's list of the sexiest man alive at the age of 48?",
                2,
                "Daniel Craig",
                "Pierce Brosnan",
                "Timothy Dalton",
                "Christian Malki",
                "Pierce Brosnan",
            )
        )
        que.add(
            QuestionData(
                "Which Småland Bond bride was chosen for Miss Sweden in 1970 and played against Roger Moore in Octopussy in 1983?",
                3,
                "Maud Adams",
                "Kristina Wayborn",
                "Izabella Scorupco",
                "Sissel Björnenak",
                "Kristina Wayborn",

                )
        )
        que.add(
            QuestionData(
                "Grace Jones plays a mysterious henchman in live target from 1985, which Swede did Jones have a glowing relationship with during the 80's?",
                4,
                "Stellan Skarsgård",
                "Lassa Hallström",
                "Dolph Lundgren",
                "Saiman Chen",
                "Dolph Lundgren",
            )
        )
        que.add(
            QuestionData(
                "Which of the following actors was considered for the role of the Joker in Suicide Squad?",
                5,
                "Ryan Gosling",
                "Jack Black",
                "Rachel McAdams",
                "Kristoffer Johansson",
                "Rachel McAdams",
            )
        )
        que.add(
            QuestionData(
                "What character does James Gunn consider to be the heart of The Suicide Squad?",
                6,
                "Ratcatcher 2",
                "King Shark",
                "Peacemaker",
                "Johan Näsvall",
                "Ratcatcher 2",
            )
        )
        que.add(
            QuestionData(
                "Which of the characters in The Suicide Squad will soon have his series of James Gunn?",
                7,
                "Harley Quinn",
                "Peacemaker",
                "Rick Flag",
                "Francisco Andresson",
                "Rick Flag",
            )
        )
        que.add(
            QuestionData(
                "When did the first fast and furious movie come out?",
                8,
                "2001",
                "2000",
                "2002",
                "2003",
                "2001",
            )
        )
        que.add(
            QuestionData(
                "How many of the films did Paul Walker take part in?",
                9,
                "Seven films",
                "Five films",
                "Six films",
                "Eight films",
                "Six films",
            )
        )


questionsLeft= que.size
        // How many questions is left
        quetext = findViewById(question_text)
        opt_1 = findViewById(R.id.opt_1)
        opt_2 = findViewById(R.id.opt_2)
        opt_3 = findViewById(R.id.opt_3)
        opt_4 = findViewById(R.id.opt_4)

        quetext.text = que[0].question
        opt_1.text = que[0].option_one
        opt_2.text = que[0].option_two
        opt_3.text = que[0].option_three
        opt_4.text = que[0].option_four

    }
    // If you have answered true or false
    fun answerChosen(view:View){
        var btn: TextView = (view as TextView)
        var ans: String = btn.getText() as String
        if (hasAnswered == false){
            if (ans == que[index].correct_ans) {
                score++
                btn.setBackgroundColor(Color.parseColor("#00FF00"))
            } else {
                btn.setBackgroundColor(Color.parseColor("#FF0000"))
                //score--
            }
            textScore.setText(score.toString())
            hasAnswered = true
            questionsLeft=questionsLeft-1
        }
    }
    //  You go to the next question
    fun goToNext(view: View){
        if(hasAnswered){
            if(questionsLeft>0){
                nextQuestion()
            }else{
                val intent = Intent(this@QuestionActivity, ResultActivity::class.java)
                intent.putExtra("score",score)
                startActivity(intent)
            }
        }
    }
    fun nextQuestion(){
        index= index +1

        quetext.text = que[index].question
        opt_1.text = que[index].option_one
        opt_2.text = que[index].option_two
        opt_3.text = que[index].option_three
        opt_4.text = que[index].option_four
        opt_1.setBackgroundColor(Color.parseColor("#FFFFFF"))
        opt_2.setBackgroundColor(Color.parseColor("#FFFFFF"))
        opt_3.setBackgroundColor(Color.parseColor("#FFFFFF"))
        opt_4.setBackgroundColor(Color.parseColor("#FFFFFF"))

        hasAnswered = false

    }
}
