package com.example.test.domain

data class Book(
    val BookId: Int,
    val BookName: String,
    val Author: String = "",
    val Year: Int? = null,
    val Pages: Int? = null,
    val Language: String = "Русский",
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
