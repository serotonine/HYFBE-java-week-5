/**
 * 1. Create a FileWriter to write into "resources/notes.txt".
 * 2. Write the following text lines into the file:
 *      - "Java I/O is powerful."
 *      - "Streams make reading and writing easier."
 * 3. Use try-with-resources for automatic stream closing.
 * 4. After writing, print "File written successfully!".
 */

package introduction.exercises;

import java.io.*;

public class Exercise4
{
    static void main() {

        String path = Config.getIntroPath() + File.separator + "notes.txt";
        File file = new File(path);
        String mess;
        try{
            if(file.exists()){
                mess = "\nThis is an overwrite.\n";
                writeInFile(file, mess);
            }
            else{
               if(file.createNewFile()){
                   mess = "Java I/O is powerful.\nStreams make reading and writing easier.\n";
                   writeInFile(file, mess);
               }
               else{
                   throw new IOException("File could not be created");
               }

            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static void writeInFile(File file, String mess) throws IOException {
        try(FileWriter writer = new FileWriter(file.getPath(), true)){
            writer.write(mess);
            System.out.println("Data successfully written to file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    };

}
