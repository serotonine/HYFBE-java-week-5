/**
 * 1. Use the File class to create a new file called "resources/students.txt".
 * 2. If the file already exists, print a message "File already exists."
 * 3. If it is newly created, print "File created successfully!"
 * 4. After creation, print the file’s absolute path.
 */

package introduction.exercises;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2
{
    public static void main(String[] args)
    {
        // Define a safe, OS-independent file path
        String path = Config.getIntroPath() + File.separator + "students.txt";
        // Instance of a File Object.
        File file = new File(path);
        try {
            // file.createNewFile() returns Boolean.
            if(file.createNewFile()){
                System.out.println("File created successfully!");

                System.out.println(file.getParentFile());
            }
            else {
                System.out.println("File already exists.");
                System.out.println(file.delete());
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
