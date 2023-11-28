package decorator1.src;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Interceptador3 implements Componente {

    private Componente componente;

    public Interceptador3(Componente componente) {
        this.componente = componente;
    }

    public void executarTarefa() throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        if (now.getMinute()%2 == 0){
            System.out.println("Execução interrompida em minuto par: " + dtf.format(now)); //01/02/2019 14:08:43
        }
        else{
        componente.executarTarefa();
        }
    }

}
