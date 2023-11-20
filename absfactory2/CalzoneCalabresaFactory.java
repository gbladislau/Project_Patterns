package absfactory2;

public class CalzoneCalabresaFactory implements AbsCalzoneFactory {
    @Override
    public Calzone criaCalzone() {
        return new CalzoneCalabresa();
    }
}
