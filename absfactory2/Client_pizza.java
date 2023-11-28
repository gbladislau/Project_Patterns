package absfactory2;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Client_pizza {
    
    Pizza pizza;
    Calzone calzone;
    Pizzaiolo pizzaiolo;

    public static String getDayOfWeek(String data) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DayOfWeek dow = DayOfWeek.from(parser.parse(data));
        return dow.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")).toUpperCase();
    }

    public static void main(String[] args) {
        Client_pizza a = new Client_pizza();
        if (args.length < 1) {
            System.out.println("USO: java App <dd/mm/yyyy>");
            System.exit(1);
        }
        
        String diaDaSemana = getDayOfWeek(args[0]);
        System.out.println(diaDaSemana);

        if(diaDaSemana.contains("DOM")){
            System.out.println("Pizzaria Fechada");
            System.exit(0);
        }

        if (diaDaSemana.contains("SEG") || diaDaSemana.contains("QUA") || diaDaSemana.contains("SEX") ) {
            a.pizzaiolo = new PizzaioloCalabresa();
        }else
            a.pizzaiolo = new PizzaioloPresunto();


        Pizza pizza = a.pizzaiolo.fazPizza();
        Calzone calzone = a.pizzaiolo.fazCalzone();
        pizza.imprimeIngredientes();
        calzone.imprimeIngredientes();
    }
}
