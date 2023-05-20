package DP.Si;

public class SquareTester {

    public static void main(String[] args) {
        Square square = Square.getInstance();
        square.setLingth(10);
        System.out.println(square.area());
        Square square2 = Square.getInstance();
        System.out.println(square2);
    }
}
