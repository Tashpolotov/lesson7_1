package com.example.lesson7_1.domain.model

class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val desc: Int
) {
    companion object {
        const val DEFAULT_ID = 0
    }
}
