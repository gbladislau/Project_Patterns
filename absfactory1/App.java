package absfactory1;

import java.util.Random;

public class App {

    public AbsHelloFactory helloFactory;
    public Hello hello;

    public static void main(String[] args) {
        App a = new App();
        
        Random random = new Random();
        if (random.nextBoolean()) {
            a.helloFactory = new HelloStringFactory();
        }
        else{
            a.helloFactory = new HelloTxtFactory();
        }

        a.hello = a.helloFactory.createHello();

        a.hello.helloWorld();
    }
}