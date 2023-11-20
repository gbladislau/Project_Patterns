package absfactory2;

public class CalzonePresunto implements Calzone {
    @Override
    public void imprimeIngredientes() {
        System.out.println("Calzone de Presunto: (queijo + presunto + tomate)");
    }
}
