package Library;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Book> issuedBooks;

    Student(String name){
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book book){
        book.issueBook();
        issuedBooks.add(book);
    }

    public void returnBook(Book book){
        book.returnBook();
        issuedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
