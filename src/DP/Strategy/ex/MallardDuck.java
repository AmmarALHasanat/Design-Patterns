package DP.Strategy.ex;

public class MallardDuck extends Duck{
    public  MallardDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior= new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
