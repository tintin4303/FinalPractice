package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    Library(){
        this.books = new ArrayList<>();
    }

    public int getBookCount(){
        return books.size();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public Book searchBookByTitle(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void displayBooks(){
        int count = 1;
        if(books.isEmpty()){
            System.out.println("No book available.");
        }else{
            for(Book book: books){
                System.out.println(count+". "+book);
                count++;
            }
        }
    }

    public List<Book> getBooks(){
        return books;
    }
}
