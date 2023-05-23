package DP.Strategy;

public class Context {
    private Strategy strategy;
    public Context(){

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.algorithm();
    }
}
