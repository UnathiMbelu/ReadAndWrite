package thirdDay;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
        public static void main(String[] args) throws FileNotFoundException {
            String filename = "C:\\Users\\unath\\OneDrive\\Desktop\\javafiles\\practise.txt";
            try {

                PrintWriter writer = new PrintWriter (filename);
                writer.println("java is cool");
                writer.println("***********");
                System.out.print("Text created");
                writer.close();
            }

            catch (Exception ex){
                System.out.println("Text not created");
            }
        }
    }



