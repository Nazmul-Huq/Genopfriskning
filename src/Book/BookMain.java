package Book;

public class BookMain {

    public static void main(String[] args) {

        // create a library
        Library nazmulLibrary = new Library();

        // make different books and add to the library
        Book criminal = new Book(123, "New Criminal", 2020);
        nazmulLibrary.addBook(criminal);
        Book novel = new Book(456, "New Novel", 2010);
        nazmulLibrary.addBook(novel);
        Book poem = new Book(789, "New Poem", 2015);
        nazmulLibrary.addBook(poem);

        // this book is created but not added to the library
        Book thriller = new Book(100, "New Poem", 2019);

        // should return true
        System.out.println(nazmulLibrary.doesBookExist(novel));

        // should return false
        System.out.println(nazmulLibrary.doesBookExist(thriller));


    } // main() ends here

} // class BookMain ends here
