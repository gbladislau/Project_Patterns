package decorator2.src;
public class Interceptador_Parenteses implements Componente {

    private Componente componente;

    public Interceptador_Parenteses(Componente componente){
        this.componente = componente;
    }

    public void imprimir(){
        System.out.print("(");
        componente.imprimir();
        System.out.print(")");
    }
    
}
