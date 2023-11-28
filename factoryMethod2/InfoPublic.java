import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InfoPublic implements Info{
    
    private String message;
    public InfoPublic(String message) {
        this.message = message;       
    }

    
    @Override
    public void printFile() {
        System.out.println(this.message);
    }

    
}
