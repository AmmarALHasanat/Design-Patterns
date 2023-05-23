package DP.Strategy.ex;

public class RadheadDuck extends Duck{
    public RadheadDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {

    }
}
