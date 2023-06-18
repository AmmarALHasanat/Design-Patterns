package DP.Observer;
import java.util.ArrayList;
import java.util.List;

public class MainTester {
    public static void main(String[] args) {

        // list of student
        List<Observer> studentList=new ArrayList<>();
        studentList.add(new Student("ahmad"));
        studentList.add(new Student("samer"));
        studentList.add(new Student("jack"));

        // Create List of book
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("Java 101","B190"));
        bookList.add(new Book("test","T100"));

        // Create library
        Libary libary=new Libary("Online library",studentList);
        libary.removeObserver(studentList.get(0));
        libary.addBook(bookList.get(0));
        libary.addBook(new Book("OOP for java","A101"));
        libary.addBook(new Book("Java 101","A410"));
        libary.removeBook(bookList.get(0));

    }
}
