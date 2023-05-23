package DP.Strategy;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new ConcreteStrategyTow());
        context.execute();
        context.setStrategy(new ConcreteStrategyOne());
        context.execute();
    }
}
