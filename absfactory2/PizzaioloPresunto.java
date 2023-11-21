package absfactory2;

public class PizzaioloPresunto implements Pizzaiolo{
    @Override
    public Calzone fazCalzone() {
        return new CalzonePresunto();
    }
    @Override
    public Pizza fazPizza() {
        return new PizzaPresunto();
    }
}
