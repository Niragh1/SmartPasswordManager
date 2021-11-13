import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//The input class with Encryption
public class TextWriter {
    public static void main( String[] args ) {
        String dataUser="";
        String dataPass="";
        String dataAcc="";
        String split=" ";
        String nl="\n";
        String result1 =null;
        int i=1;
        System.out.println("-----Welcome to Smart Password Manager-----");
        System.out.println("-----Keep saving password-----");
        try
        {
            do
            {
            Scanner userScn = new Scanner(System.in);
            Scanner passwordScn = new Scanner(System.in);

                System.out.println("Account name");
                dataAcc = passwordScn.next();
                System.out.println("Enter the username");
                dataUser = userScn.next();
                System.out.println("Enter the password");
                String user = passwordScn.next().trim();
                char[] sh = user.toCharArray();
                for (int i1 = 0; i1 < sh.length; i1++) {
                    sh[i1] = sh[i1] += 5;
                }

                String string = new String(sh);
                dataPass = string;
                File f1 = new File("username.txt");
                if (!f1.exists())
                {
                    f1.createNewFile();
                 }

                FileWriter fileWritter = new FileWriter(f1.getName(), true);
                 BufferedWriter bw = new BufferedWriter(fileWritter);

                bw.write(dataAcc);
                bw.write(split);
                bw.write(dataUser);
                bw.write(split);
                bw.write(dataPass);
                bw.write(nl);
                bw.close();
                System.out.println("Done");
                Scanner re = new Scanner(System.in);
                System.out.println("\nwish to continue(y/n)");
                result1 = re.next();
                System.out.println("----Thank you for using Smart Password Manager-----");
            }
                while (result1.equals("y"));
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}