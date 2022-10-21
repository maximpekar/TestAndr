package com.example.test.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Book")
data class BookDBModel(
    @PrimaryKey(autoGenerate = true)
    val BookId: Int,

    val BookName: String,
    val Author: String = "",
    val Year: Int? = null,
    val Pages: Int? = null,
    val Language: String = "Русский",
)
