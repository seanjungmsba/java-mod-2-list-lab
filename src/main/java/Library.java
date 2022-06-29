import java.util.ArrayList;
import java.util.List;

class Library {

    static List<Book> books = new ArrayList<Book>();

    public static void addBook(Book book){
        System.out.println();
        books.add(book);
    }

    public static void removeBook(Book book) {
        books.remove(book);
    }

    public static List<Book> getLibrary() {
        return books;
    }

    @Override
    public String toString() {
        return books.toString();
    }

}