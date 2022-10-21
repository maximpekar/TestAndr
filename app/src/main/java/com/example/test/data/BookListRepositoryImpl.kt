package com.example.test.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.test.domain.Book
import com.example.test.domain.BookListRepository
import javax.inject.Inject

class BookListRepositoryImpl @Inject constructor(
    private val bookDao: BookDao,
    private val mapper: BookMapper
) : BookListRepository {
    override fun getBook(bookId: Int): Book {
        val bookDBModel = bookDao.getBook(bookId)
        return mapper.mapDBModelToEntity(bookDBModel)
    }

    override fun getBookList(bookAuthor: String, bookName: String): LiveData<List<Book>>  = Transformations.map(
        bookDao.getBookList(bookAuthor, bookName)
    ) {
        mapper.mapListDbModelToListEntity(it)
    }
}