package com.krilliator.projektarbete_quizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.krilliator.projektarbete_quizapp.R.id.*

class QuestionActivity2 : AppCompatActivity() {
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
        setContentView(R.layout.activity_question2)

        // Where all the questions are
        textScore = findViewById(R.id.textScore)
        que.add(
            QuestionData(
                "Måns Zelmerlöv won the Eurovision Song Contest 2015, with which song?",
                1,
                "Heroes",
                "Walk with me",
                "Cara Mia",
                "Happyland",
                "Heroes",
            )
        )
        que.add(
            QuestionData(
                "Which country has the most profits in Eurovision Song Contest?",
                2,
                "Ireland",
                "Sweden",
                "Spain",
                "France",
                "Ireland",
            )
        )
        que.add(
            QuestionData(
                "Which country has come last several times in Eurovision Song Contest?",
                3,
                "Norway",
                "Ausria",
                "Russia",
                "Italy",
                "Norway",

                )
        )
        que.add(
            QuestionData(
                "In 2016, Ukraine won with the song 1944, what is the name of the female artist?",
                4,
                "Jamala",
                "Ruslana",
                "Verka Serduchka",
                "Ani Lorak",
                "Jamala",
            )
        )
        que.add(
            QuestionData(
                "What is the name of the song by the Conchita Wurst for Austria that won the Eurovision Song Contest in 2014?",
                5,
                "Rise like a Phoenix",
                "All I Wanna Do",
                "Hit Me",
                "From Vienna with Love",
                "Rise like a Phoenix",
            )
        )
        que.add(
            QuestionData(
                "Which year does Helena Paparizuou won for Greece?",
                6,
                "2005",
                "2007",
                "2002",
                "2008",
                "2005",
            )
        )
        que.add(
            QuestionData(
                "What was the name of the winning song that Helena Paparizuou sang?",
                7,
                "My number one",
                "Deja Vu",
                "Gia Pia Agapi",
                "Apohrosis",
                "My number one",
            )
        )
        que.add(
            QuestionData(
                "Sweden has won the Eurovision Song Contest a total of six times, which are the artist?",
                8,
                "Carola, ABBA, Herreys, Måns Zelmerlöv, Loreen & Charlotte Perrelli",
                "Oscar Zia, Tusse, John Lundvik, The Mamas & Cornelia Jakobs",
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
                val intent = Intent(this@QuestionActivity2, ResultActivity::class.java)
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
