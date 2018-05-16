package com.davissylvester.dfitnesstracker

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.davissylvester.dfitnesstracker.R.id.txtQ2Health
import com.davissylvester.dfitnesstracker.domainClasses.Choice
import com.davissylvester.dfitnesstracker.domainClasses.Question
import kotlinx.android.synthetic.main.activity_quiz.*
import java.lang.Integer.parseInt

class Quiz : AppCompatActivity() {

    // private val questions = mutableListOf<Question>()

//    private  val questions: ArrayList<Question> = ArrayList()

    var q1Answer: String = ""
    var q2Answer: String = ""
    var q3Answer: String = ""
    var q4Answer: String = ""
    private var hasError: Boolean = false;

    var questions = ArrayList<Question>()

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        addAllQuestions()

                addChoicesForQuestion(0)

    }

    fun addAllQuestions() {

        questions.add(Question(0, "What are your goals to workout?", null, null))
        questions.add(Question(1, "How many days a week do you want to workout?", null, null))
        questions.add(Question(2, "Are you looking for advice on nutrition?", null, null))
        questions.add(Question(3, "Do you currently eat healthy?", null, null))
        questions.add(Question(4, "Have you worked with a personal trainer before?", null, null))
        questions.add(Question(5, "Are you looking for one-on-one personal training?", null, null))
        questions.add(Question(6, "Are you willing to workout on the weekend?", null, null))
    }

    fun addChoicesForQuestion() {


    }

    fun addChoicesForQuestion(questionId: Int) {

        var choices = mutableListOf<Choice>()

        choices.add(Choice(0, "Get Fit"))
        choices.add(Choice(1, "Lose weight"))
        choices.add(Choice(2, "Build Muscle"))
        choices.add(Choice(3, "Cut Muscle"))


        questions[questionId].Choices = choices.toList()





    }

    fun onQuestionOneRbChange(view: View) {

        when(view.id) {

            R.id.rbLossWeight -> {

                q1Answer = "Lose Weight"
                Log.d("q1", q1Answer)
               //  q1Answer.toast(this)
            }

            R.id.rbBeFit -> {
                q1Answer = "Be Fit"
                Log.d("q1", q1Answer)
                // q1Answer.toast(this)
            }

            else -> {
                Log.d("q1", "No Answer")
            }
        }
    }

    fun onImmediateStartChange(view: View) {

        when(view.id) {

            R.id.rbQ4No -> {

                q4Answer = "No"
                Log.d("q4", q4Answer)
            }

            R.id.rbQ4Yes -> {
                q4Answer = "Yes"
                Log.d("q4", q4Answer)

            }

            else -> {
                Log.d("q4", "No Answer")
            }
        }
    }

    fun saveQuiz(view: View) {

        getResponseFromQuestionOne()
        getResponseFromQuestionTwo()
        getResponseFromQuestionThree()
        getResponseFromQuestionFour()

        validateForm()



    }

    private fun validateForm() {

        if (!hasError) {

            showErrorToaster("Your responses have been recorded!")
        }

    }

    private fun getResponseFromQuestionOne() {

        if (q1Answer == "") {

            hasError = true
            showErrorToaster("Question #1 must have an answer")

        }




    }

    private fun getResponseFromQuestionTwo() {

     var q2Answer = txtQ2Health.text.toString()

        if (q2Answer == "") {

            hasError = true
            "Question #2 must have an answer".toast(this)

        }




    }

    private fun getResponseFromQuestionThree() {

        var days = intArrayOf(-1, -1, -1)



        if (cbMonday.isChecked) {
            days[0] = 1
        }

        if (cbWed.isChecked) {
            days[1] = 1
        }

        if (cbSaturday.isChecked) {
            days[2] = 1
        }
             


        if (days.all { number -> radioButtonHasDefaultValue(number)  }){
            hasError = true

            "Question #3 requires you to select at least one day".toast(this)
        }


    }

    private fun radioButtonHasDefaultValue(number: Int ): Boolean {

        if (number == -1) {
            return true
        }

        return false
    }
    private fun getResponseFromQuestionFour() {

        if (q4Answer == "") {

            hasError = true
            showErrorToaster("Question #4 must have an answer")

        }
    }

    private fun Any.toast(context: Context, duration: Int = Toast.LENGTH_SHORT): Toast {
        return Toast.makeText(context, this.toString(), duration).apply { show() }
    }

    private fun showErrorToaster(msg: String) {
        msg.toast(this)
    }


}
