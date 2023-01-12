package pro.sky.java.course1.lesson2;

import java.util.Objects;

public class Book {
    private final Author author;
    private String bookName;
    private int publicYearBook;

    public Book(String bookName, int publicYearBook, Author author) {
        this.author = author;
        this.bookName = bookName;
        this.publicYearBook = publicYearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicYearBook() {
        return this.publicYearBook;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublicYearBook(int publicYearBook) {
        this.publicYearBook = publicYearBook;
    }

    @Override
    public String toString() {
        return author.toString() + " ; " + bookName + "," + publicYearBook;
    }



    @Override
    public boolean equals(Object other) {
        if(this== other){
            return true;
        }
        if ( other==null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return this.publicYearBook == book.publicYearBook && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publicYearBook);

    }
}