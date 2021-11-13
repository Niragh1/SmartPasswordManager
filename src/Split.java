import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Struct;
import java.util.Scanner;
//The output with decryption
    public class Split{

        //public static void main(String args[]) throws FileNotFoundException{

            String result1 = null;
            void saved() throws FileNotFoundException {

                try {
                    System.out.println("------Get Password Here-----");

                    do {
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Enter the account name:");
                        String word = sc1.next();
                        boolean flag = false;
                        int times = 0;
                        String[] words = null;

                        Scanner input = new Scanner(new FileInputStream("username.txt"));
                        File file = new File("username.txt");
                        input = new Scanner(file);
                        while (input.hasNextLine()) {
                            String line = input.nextLine();
                            if (line.indexOf(word) != -1) {
                                words = line.trim().split("\\s+");
                                flag = true;
                                times++;
                                System.out.println("username is :" + words[1]);
                                String oPass = words[2];
                                char[] sh = oPass.toCharArray();
                                for (int i1 = 0; i1 < sh.length; i1++) {
                                    sh[i1] = sh[i1] -= 5;
                                }

                                String string = new String(sh);
                                oPass = string;

                                System.out.println("Password is is :" + oPass);

                            }
                        }


                        input.close();


                        if (flag) {
                            System.out.println(times + " " + word + " " + "Account found!");
                        } else
                            System.out.println("Account Doesn't Exist");
                        Scanner re = new Scanner(System.in);
                        System.out.println("\nDo you want more passwords(y/n)");
                        result1 = re.next();
                    }
                    while (result1.equals("y"));

                }
                catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }
        }
    }


