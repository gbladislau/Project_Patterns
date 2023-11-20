package absfactory2;

public class PizzaPresuntoFactory implements AbsPizzaFactory{
    @Override
    public Pizza criaPizza() {
        return new PizzaPresunto();
    }
}
