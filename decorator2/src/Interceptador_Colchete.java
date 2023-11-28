package decorator2.src;
public class Interceptador_Colchete implements Componente {

    private Componente componente;

    public Interceptador_Colchete(Componente componente){
        this.componente = componente;
    }

    public void imprimir(){
        System.out.print("[");
        componente.imprimir();
        System.out.print("]");
    }
    
}
