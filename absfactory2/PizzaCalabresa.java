package absfactory2;

public class PizzaCalabresa implements Pizza{
    @Override
    public void imprimeIngredientes() {
        System.out.println("Pizza de Calabresa: (queijo + calabresa + tomate)");
    }
}
