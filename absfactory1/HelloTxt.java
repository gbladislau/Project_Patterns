package absfactory1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloTxt implements Hello {

    @Override
    public void helloWorld() {
        try {
            String str = "Hello, World";
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            System.out.println("ERRO DE IO");
        }
    }

}