import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Split{
    public static void main(String args[]) throws FileNotFoundException{

        //Scanner SplitSc = new Scanner(new FileInputStream("username.txt"));
        String s1="Twitter nirag hi@123";
        String[] words=s1.split("\\s");

        System.out.println("Account  is :"+words[0]);
        System.out.println("username is :"+words[1]);
        System.out.println("Password is is :"+words[2]);


        /*String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);*/
        }
    }