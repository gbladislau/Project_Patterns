package decorator1.src;
public class Interceptador1 implements Componente {

    private Componente componente;

    public Interceptador1(Componente componente){
        this.componente = componente;
    }

    public void executarTarefa() throws InterruptedException {
        
        long antes = System.currentTimeMillis();
        componente.executarTarefa();
        long depois = System.currentTimeMillis();
        System.out.println((depois - antes) + "ms");
    }
    
}
