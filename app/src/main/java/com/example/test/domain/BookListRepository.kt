package com.example.test.domain

import androidx.lifecycle.LiveData

interface BookListRepository {

    fun getBook(bookId: Int): Book

    fun getBookList(bookAuthor: String, bookName: String): LiveData<List<Book>>
}