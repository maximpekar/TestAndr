package com.example.test.domain

class GetBook(private val bookListRepository: BookListRepository) {
    fun getBook(bookId: Int): Book {
        return bookListRepository.getBook(bookId)
    }
}