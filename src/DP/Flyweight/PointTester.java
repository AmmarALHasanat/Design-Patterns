package DP.Flyweight;

public class PointTester {
    public static void main(String[] args) {
        Point p1= Point.getInstance(2,4,5);
        System.out.println(p1);
        Point p2= Point.getInstance(1,5,7);
        System.out.println(p2.toString());
        Point p3= Point.getInstance(2,5,7);
        System.out.println(p3.toString());
        Point p4= Point.getInstance(2,5,7);
        System.out.println(p4.toString());

    }
}

