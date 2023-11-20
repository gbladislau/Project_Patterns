package absfactory2;

public class PizzaPresunto implements Pizza{
    @Override
    public void imprimeIngredientes() {
        System.out.println("Pizza de Presunto: (queijo + presunto + tomate)");
    }
}
