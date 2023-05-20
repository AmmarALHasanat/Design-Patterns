package DP.Si;

public class Singleton {
    private static Singleton instance;
    private boolean isConet;
    private Singleton(){
        isConet=false;
    }
    public void Coneted(){
        isConet=true;
    }
    public void disConet(){
        isConet=false;
    }

    public static Singleton getInstance() {
        if (instance==null){
            instance= new Singleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "isConet=" + isConet +
                '}';
    }
}
