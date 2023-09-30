public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double doCalculate(double a, double b){
        return this.strategy.calculate(a, b);
    }
}
