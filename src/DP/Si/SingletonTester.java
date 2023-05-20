package DP.Si;

public class SingletonTester {
    public static void main(String[] args) {
        Singleton single= Singleton.getInstance();
        System.out.println(single);
        single.Coneted();

        Singleton single2=Singleton.getInstance();
        System.out.println(single2);
    }
}
