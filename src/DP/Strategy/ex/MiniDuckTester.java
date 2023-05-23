package DP.Strategy.ex;

public class MiniDuckTester {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        // you can change behavior without edit code
        FlyBehavior fly=new FlyWithWings();
        mallard.setFlyBehavior(fly);
        mallard.performFly();
    }
}
