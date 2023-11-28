import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InfoConfidential implements Info {
    private String message;
    public InfoConfidential(String message) {
        this.message = message;     
    
    }
    @Override
    public void printFile() {
        System.out.println(message);
    }

    
}
