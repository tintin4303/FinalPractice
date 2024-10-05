package Library;

import java.util.List;

public class Librarian {
    private String name;
    private Library library;

    Librarian(){

    }


    Librarian(String name, Library library){
        this.name = name;
        this.library = library;
    }

    public void addBook(Book book){
        library.addBook(book);
        System.out.println(book +" has been added to the library.");
    }

    public void removeBook(Book book){
        library.removeBook(book);
        System.out.println(book+" has been removed from the library.");
    }

    public void displayBooks(){
        library.displayBooks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
