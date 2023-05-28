package DP.Flyweight;

public class SquareTeser {
    public static void main(String[] args) {
        Square s1=Square.getInstance(5);
        System.out.println(s1);
        Square s2=Square.getInstance(5);
        System.out.println(s2);
        Square s3=Square.getInstance(6);
        System.out.println(s3);
    }
}
