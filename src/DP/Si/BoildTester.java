package DP.Si;

public class BoildTester {
    public static void main(String[] args) {
        Boilor b1= Boilor.getInstance();
        b1.fill();
        b1.boil();
        System.out.println(b1);
        Boilor b2= Boilor.getInstance();
        System.out.println(b2);
        b2.drain();
        System.out.println(b1);
    }
}
