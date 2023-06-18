package DP.Observer;

import java.util.ArrayList;
import java.util.List;

public class Libary implements  Subject{
    private String name;
    private List<Observer> observerList;
    private List<Book> bookList;

    public Libary(String name, List<Observer> observerList) {
        this.name = name;
        this.observerList = observerList;
        this.bookList=new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
        notifyObservers("add new book "+ book.toString());
    }

    public void removeBook(Book book){
        bookList.remove(book);
        notifyObservers("remove book "+ book.toString());

    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer :observerList) {
            observer.update(message);
        }
    }
}
