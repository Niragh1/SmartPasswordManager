import java.io.FileNotFoundException;
import java.io.IOException;

public class Menu {
    public static void main (String[] args) throws FileNotFoundException {
        try {
            Choice choice = new Choice();
            choice.choice();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
