package DP.Si;

public class Square {
    private int lingth;
    private static Square instance;

    private Square(){
        lingth=0;
    }

    public static Square getInstance() {
        if (instance==null){
            instance= new Square();
        }
        return instance;
    }

    public void setLingth(int lingth) {
        this.lingth = lingth;
    }

    public int getLingth() {
        return lingth;
    }
    public int area(){
        return lingth*lingth;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lingth=" + lingth +
                '}';
    }
}
