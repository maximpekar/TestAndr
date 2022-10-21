package com.example.test.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
//import com.example.test.domain.Book

@Dao
interface BookDao {

    @Query("SELECT * FROM Book WHERE BookID=:bookId LIMIT 1")
    fun getBook(bookId: Int): BookDBModel

    @Query("SELECT * FROM Book WHERE Author=:bookAuthor AND BookName=:bookName")
    fun getBookList(bookAuthor: String, bookName: String): LiveData<List<BookDBModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addBookTo(bookDBModel: BookDBModel)
}