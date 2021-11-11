import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Output{
    public static void main(String args[]) throws FileNotFoundException{

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the account name:");
        String word = sc1.next();
        boolean flag = false;
        int count = 0;
        String line ="";


        Scanner sc2 = new Scanner(new FileInputStream("username.txt"));
        while(sc2.hasNextLine()) {
            line = sc2.nextLine();
            //System.out.println(line);
            if(line.indexOf(word)!=-1) {

                flag = true;
                count = count+1;
            }

        }
        String []array =line.split(" ");
        System.out.println("index "+ array[1]);
        if(flag) {
            System.out.println("Account found!");

        }else {
            System.out.println("Account not found!!");
        }
        System.out.println("Account is  "+ array[0]);
        System.out.println("username is  "+ array[1]);
        System.out.println("Password is  "+ array[2]);


    }
}
