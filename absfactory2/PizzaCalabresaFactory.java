package absfactory2;

public class PizzaCalabresaFactory implements AbsPizzaFactory{
    @Override
    public Pizza criaPizza() {
        return new PizzaCalabresa();
    }
}
