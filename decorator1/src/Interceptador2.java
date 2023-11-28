package decorator1.src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Interceptador2 implements Componente {

    private Componente componente;

    public Interceptador2(Componente componente) {
        this.componente = componente;
    }

    public void executarTarefa() throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print(dtf.format(now) + ": "); //01/02/2019 14:08:43
        componente.executarTarefa();
    }

}
