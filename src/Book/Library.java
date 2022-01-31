package Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * add a book to the given library
     * @param book
     */
    public void addBook(Book book){
        this.books.add(book);
    }

    /**
     * check if the given book exits in the library or not
     * return true or false depending on given book found or not
     */
    public boolean doesBookExist(Book book){

        // first get the isbn-number of the given book
        int isbnGivenBook = book.getIsbnNumber();

        // search for book in the given library
        for (int i = 0; i < this.books.size(); i++) {
            Book currentBook = this.books.get(i);
            int isbnCurrentBook = currentBook.getIsbnNumber();
            if (isbnCurrentBook == isbnGivenBook) {
                return true;
            }
        }
        return false;
    }


} // class Library ends here
