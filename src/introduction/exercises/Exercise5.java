/**
 * 1. Use FileInputStream and FileOutputStream to copy a file.
 * 2. Read from "source.txt" and write its content into "backup.txt".
 * 3. Use try-with-resources to automatically close both streams.
 * 4. After copying, print "File copied successfully!".
 * 5. Handle IOException properly.
 */

package introduction.exercises;

import java.io.*;
import java.nio.file.Path;

public class Exercise5
{
    public static void main(String[] args)
    {
        Path path = Config.getIntroPath();
        String sourcePath = path + File.separator + "source.jpg";
        String targetPath = path + File.separator + "copy.jpg";

        if(copy(sourcePath, targetPath)){
            System.out.println("File copied successfully!");
        }
        else {
        System.out.println("Couille in ze potage!");
    }

    }
    public static boolean  copy(String inputPath, String outputPath){
        try(
                FileInputStream input = new FileInputStream(inputPath);
                FileOutputStream output = new FileOutputStream(outputPath)){
            int byteData;
            while ((byteData = input.read()) != -1){
                output.write(byteData);
            }
            return true;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
