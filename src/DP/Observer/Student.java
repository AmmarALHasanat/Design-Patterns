package DP.Observer;

public class Student implements Observer{
    private String name;
    public Student(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        System.out.println("Hi,"+this.name+"\nyou has new notification:\n"+message);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
