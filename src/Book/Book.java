package Book;

public class Book {

    private int isbnNumber;
    private String title;
    private int publishedYear;

    public Book(int isbnNumber, String title, int publishedYear) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber=" + isbnNumber +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
} // class Book ends here
