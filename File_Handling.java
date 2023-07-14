 import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class File_Handling {
    public static void main(String[] args) {
        //Code to create a new file
        /*File myFIle=new File("Example.txt");
         try {
             myFIle.createNewFile();
         }catch (Exception e){
             System.out.println(e);
         }*/
         //Code to write to a file

        /*try {
            FileWriter fileWriter =new FileWriter("Example.txt");
           fileWriter.write("This is our first file from java course");
           fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Reading a file
       /* File myfile = new File("Coding.txt");
        try {
            Scanner scanner = new Scanner(myfile);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        File myfile = new File("Coding.txt");
        if(myfile.delete()){
            System.out.println("I have deleted :"+myfile.getName());
        }

    }
}
