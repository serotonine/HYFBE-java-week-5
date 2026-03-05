/**
 *  1. Read input from System.in and store it in a String variable.
 *  2. Create a file whose name is the same as the user's input and write that input into the file.
 *  3. Use Scanner and FileWriter with try-with-resources.
 *  4. After writing, print "File written successfully!".
 *  5. Handle IOException properly.
 */

package introduction.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Config.getIntroPath();
        int nbSentences = 5;
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        String fileName = name.toLowerCase().replaceAll("[\\s ,]", "_");
        System.out.println("filename " + fileName);
        // New File instance.
        File file = new File(STR."\{path}\{File.separator}\{fileName}.txt");
        if(!file.exists()) {
            if(file.createNewFile()){
                System.out.println(file.getName() + " created.");
            }
        }
       System.out.println("File path: " + file.getAbsolutePath());
        System.out.print("How many sentence would do like to write? ");
        // Set nbSentences.
        if(scanner.hasNextInt()){
            nbSentences = scanner.nextInt();
            scanner.nextLine();
        }
        try(FileWriter writer = new FileWriter(file.getPath(), true)){
           while(nbSentences > 0){
                System.out.print("Write a sentence: ");
                String str = scanner.nextLine();
                writer.write(str + "\n");
               nbSentences--;
           }
            System.out.println(file.getName() + " was written.");
           scanner.close();
        }
        catch (IOException e){
            System.out.println("Write Error: " + e.getMessage());
        }

    }
}
