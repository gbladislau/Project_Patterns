import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InfoFactory {

    private String readFile(String path) {
        try {
            String message = "";
            File file = new File(path);
            Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            message += myReader.nextLine();            
        }
        myReader.close();

        return message;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
        
    }
 
    public Info createInfo(String passwrord) {
        if (passwrord.equals("designpatterns"))           
            return new InfoConfidential(readFile("src\\confidencial.txt"));        
        else 
            return new InfoPublic(readFile("src\\publico.txt"));
        
    }

}
