package thirdDay;

import java.io.*;

public class Read {
        public static void main(String[] args) throws FileNotFoundException {
            String filename = "C:\\Users\\unath\\OneDrive\\Desktop\\javafiles\\practise.txt";
            String line = null;
            try {
                FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);


                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            }
            catch (FileNotFoundException ex){
                System.out.println("File not found '" + filename + "'");
            }
            catch (IOException ex){
                System.out.println("Error reading file '" + filename + "'");
            }
        }
}


