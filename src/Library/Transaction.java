package Library;

import java.time.LocalDate;

public class Transaction {
    private String transactionID;
    private Student student;
    private Book book;
    private String transactionType;
    private LocalDate date;

    Transaction(){

    }

    Transaction(String transactionID, Student student, Book book, String transactionType){
        this.transactionID = transactionID;
        this.student = student;
        this.book = book;
        this.transactionType = transactionType;
        this.date = LocalDate.now();
    }


    public void recordTransaction(){
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Student: " + student.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Date: " + date);
        System.out.println("----------------------------");
    }

}
