package absfactory2;

public class PizzaioloCalabresa implements Pizzaiolo {
    @Override
    public Calzone fazCalzone() {
        return new CalzoneCalabresa();
    }
    @Override
    public Pizza fazPizza() {
        return new PizzaCalabresa();
    }
}
