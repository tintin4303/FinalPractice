package Library;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private int availableCopies;

    Book(){

    }

    Book(String bookID, String title, String author, int availableCopies){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public void getBookInfo(){
        System.out.println("Book ID: " + bookID + "\nTitle: "+title+"\nAuthor: "+author+"\nAvailable Copies: "+availableCopies);
    }

    public void issueBook(){
        if(availableCopies>0){
            availableCopies-=1;
            System.out.println("Book has been issued.");
        }else{
            System.out.println("This book is not available.");
        }
    }

    public void returnBook(){
        availableCopies+=1;
        System.out.println("Book has been returned.");
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "bookID: " + bookID +
                ", title: " + title +
                ", author: " + author +
                ", availableCopies: " + availableCopies;
    }
}

