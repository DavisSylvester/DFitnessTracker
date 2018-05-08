package com.davissylvester.dfitnesstracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.davissylvester.dfitnesstracker.domainClasses.Choice
import com.davissylvester.dfitnesstracker.domainClasses.Question

class Quiz : AppCompatActivity() {

    // private val questions = mutableListOf<Question>()

//    private  val questions: ArrayList<Question> = ArrayList()

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


        val temp = questions.get(questionId)






    }
}
