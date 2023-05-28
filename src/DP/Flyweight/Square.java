package DP.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Square {
    private int len;
    private static Map<Integer,Square> myMap= new HashMap<>();
    private Square(int len){
         this.len=len;
    }
    public static Square getInstance(int len){
        if (myMap.containsKey(len)){
            return myMap.get(len);
        }
        Square s1=new Square(len);
        myMap.put(len,s1);
        return s1;
    }

    public int getLen() {
        return len;
    }

    @Override
    public String toString() {
        return super.toString()+", Square{" +
                "len=" + len +
                '}';
    }
}
