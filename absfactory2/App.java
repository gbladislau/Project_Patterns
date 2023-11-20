package absfactory2;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    
    public static String getDayOfWeek(String data) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DayOfWeek dow = DayOfWeek.from(parser.parse(data));
        return dow.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")).toUpperCase();
    }

    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("USO: java App <dd/mm/yyyy>");
            System.exit(1);
        }
        
        String diaDaSemana = getDayOfWeek(args[0]);
        System.out.println(diaDaSemana);

        if(diaDaSemana.equals("DOM")){
            System.out.println("Pizzaria Fechada");
            System.exit(0);
        }

        Pizzaiolo p = new Pizzaiolo(diaDaSemana);

        Pizza pizza = p.fazPizza();
        Calzone calzone = p.fazCalzone();
        pizza.imprimeIngredientes();
        calzone.imprimeIngredientes();
    }
}
