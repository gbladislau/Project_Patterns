package absfactory1;
public class HelloStringFactory implements AbsHelloFactory{
    @Override
    public Hello createHello() {
        return new HelloString();
    }
}
