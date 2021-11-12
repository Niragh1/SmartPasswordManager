import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
    public class Split{

        public static void main(String args[]) throws FileNotFoundException{

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the account name:");
            String word = sc1.next();
            boolean flag = false;
            int times =0;
            String[] words = null;



            Scanner input = new Scanner(new FileInputStream("username.txt"));

            File file = new File("username.txt");

            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if(line.indexOf(word)!=-1) {

                    words=line.trim().split("\\s+");
                    flag = true;
                    times++;
                    //System.out.println(times+"Account found!");
                    System.out.println("username is :"+words[1]);
                    System.out.println("Password is is :"+words[2]);

                }
            }


            input.close();


            if(flag) {
                System.out.println("Account found!");
                System.out.println(word);

                /*System.out.println("username is :"+words[1]);
                System.out.println("Password is is :"+words[2]); */ }}}

