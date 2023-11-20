package absfactory2;

public class CalzonePresuntoFactory implements AbsCalzoneFactory{
    @Override
    public Calzone criaCalzone() {
        return new CalzonePresunto();
    }
}
