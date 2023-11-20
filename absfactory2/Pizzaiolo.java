package absfactory2;

public class Pizzaiolo implements PizzaioloInterface {
    AbsPizzaFactory pizzaFactory;

    Pizzaiolo(String dia){
        switch (dia) {
            case "SEG":
                pizzaFactory = new PizzaCalabresaFactory();
                break;
            case "QUA":
                pizzaFactory = new PizzaCalabresaFactory();
                break;
            case "SEX":
                pizzaFactory = new PizzaCalabresaFactory();
                break;
            default:
                pizzaFactory = new PizzaPresuntoFactory();
                break;
        }
    }

    @Override
    public Pizza fazPizza() {
        return pizzaFactory.criaPizza();
    }
}
