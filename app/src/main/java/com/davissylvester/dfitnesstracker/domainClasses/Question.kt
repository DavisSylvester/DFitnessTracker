package com.davissylvester.dfitnesstracker.domainClasses

data class Question(var Id: Int, var Text: String, var Choices: List<Choice>?, var Answer: Answer?) {
}