package absfactory1;
public class HelloTxtFactory implements AbsHelloFactory{
    @Override
    public Hello createHello() {
        return new HelloTxt();
    }
}
