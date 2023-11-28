package decorator2.src;
public class Interceptador_Chave implements Componente{

    private Componente componente;

    public Interceptador_Chave(Componente componente){
        this.componente = componente;
    }

    public void imprimir(){
        System.out.print("{");
        componente.imprimir();
        System.out.print("}");
    }
    
}