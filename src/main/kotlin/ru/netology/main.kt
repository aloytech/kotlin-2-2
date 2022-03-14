package ru.netology

fun main() {
    val likes = 102
    val peopleRightForm = if (likes % 10 > 1 && likes % 10 < 5) "человека" else "человек"
    println("$likes $peopleRightForm оценили Вашу публикацию")
}