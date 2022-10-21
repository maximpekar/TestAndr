package com.example.test.data
import com.example.test.domain.Book
import javax.inject.Inject

class BookMapper @Inject constructor() {

    fun mapEntityToDBModel(book: Book) = BookDBModel(
        BookId = book.BookId,
        BookName = book.BookName,
        Author = book.Author,
        Year = book.Year,
        Pages = book.Pages,
        Language = book.Language
    )

    fun mapDBModelToEntity(bookDBModel: BookDBModel) = Book(
        BookId = bookDBModel.BookId,
        BookName = bookDBModel.BookName,
        Author = bookDBModel.Author,
        Year = bookDBModel.Year,
        Pages = bookDBModel.Pages,
        Language = bookDBModel.Language
    )

    fun mapListDbModelToListEntity(list: List<BookDBModel>) = list.map {
        mapDBModelToEntity(it)
    }
}