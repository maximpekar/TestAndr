package com.example.test.data

import androidx.lifecycle.LiveData
import com.example.test.domain.Book
import com.example.test.domain.BookListRepository

object BookListRepositoryImpl: BookListRepository {
    override fun getBook(bookId: Int): Book {
        TODO("Not yet add work with SQLite")
    }

    override fun getBookList(bookAuthor: String, bookName: String): LiveData<List<Book>> {
        TODO("Not yet add work with SQLite")
    }
}