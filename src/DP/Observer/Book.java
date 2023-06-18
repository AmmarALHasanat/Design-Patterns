package DP.Observer;

public class Book {
    private String name;
    private String no;
    //......


    public Book(String name, String no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}
