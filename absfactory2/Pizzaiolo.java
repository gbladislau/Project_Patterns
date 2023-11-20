package absfactory2;

public class Pizzaiolo implements PizzaioloInterface {
    AbsPizzaFactory pizzaFactory;
    AbsCalzoneFactory calzoneFactory;
    Pizzaiolo(String dia){
        switch (dia) {
            case "SEG":
                pizzaFactory = new PizzaCalabresaFactory();
                calzoneFactory = new CalzoneCalabresaFactory();
                break;
            case "QUA":
                pizzaFactory = new PizzaCalabresaFactory();
                calzoneFactory = new CalzoneCalabresaFactory();

                break;
            case "SEX":
                pizzaFactory = new PizzaCalabresaFactory();
                calzoneFactory = new CalzoneCalabresaFactory();
                break;
            default:
                pizzaFactory = new PizzaPresuntoFactory();
                calzoneFactory = new CalzonePresuntoFactory();
                break;
        }
    }

    @Override
    public Pizza fazPizza() {
        return pizzaFactory.criaPizza();
    }
    @Override
    public Calzone fazCalzone() {
        return calzoneFactory.criaCalzone();
    }
    
}
