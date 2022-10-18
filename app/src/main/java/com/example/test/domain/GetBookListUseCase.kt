package com.example.test.domain

import androidx.lifecycle.LiveData

class GetBookListUseCase(private val bookListRepository: BookListRepository) {
    fun getBookList(bookAuthor: String = "", bookName: String = ""): LiveData<List<Book>> {
        return bookListRepository.getBookList(bookAuthor, bookName)
    }
}