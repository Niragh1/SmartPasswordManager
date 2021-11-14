import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Choice {
    String resultchoice=null;
    void choice() throws FileNotFoundException {
        try {
            System.out.println("----Welcome to Smart Password Manager----");
            System.out.println("----Menu----");
            do {
                System.out.println("1.Saving passwords \n2.Saved Passwords \n3.Exit");
                Scanner cho = new Scanner(System.in);
                System.out.println("Enter your choice:");
                int key1 = cho.nextInt();
                switch (key1) {
                    case 1:

                        TextWriter textwriter = new TextWriter();
                        textwriter.create();
                        break;
                    case 2:
                        Split split = new Split();
                        split.saved();
                        break;
                    case 3:
                        System.out.println("Exiting..");
                        System.out.println("----Thank you---");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice .... Please Enter correct Choice");
                        break;
                }
                Scanner re = new Scanner(System.in);
                System.out.println("\nwish to Exit ?(y/n)");
                resultchoice = re.next();
            }

            while (resultchoice.equals("n"));


            System.out.println(" Good Bye! See you soon...");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
