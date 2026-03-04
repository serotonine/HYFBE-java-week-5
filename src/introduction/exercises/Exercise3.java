/**
 * 1. Create a File object pointing to the ("resources") directory.
 * 2. List all files and folders in it.
 * 3. Print each item’s name:
 *      - Add "[DIR]" before folder names.
 *      - Add "[FILE]" before file names.
 * 4. Print the total number of files and directories found.
 */

package introduction.exercises;

import java.io.File;

public class Exercise3
{
    public static void main(String[] args)
    {
        // 1. Create a File object pointing to the ("resources") directory.
        String path = Config.getResPath().toString();
        File dir = new File(path);
        if(dir.exists()){
            listFiles(dir);
            }
        else{
            System.out.println("File not found!");
        }

    }

    public static void listFiles(File dir){
        if(dir.isDirectory()){
            System.out.println("[DIR] " + dir.getName());
           File[] files = dir.listFiles();
           if(files != null){
               for(File f:files){
                   if(f.isDirectory()){
                       listFiles(f);
                   }
                   else{
                       System.out.println("[FILE]" + f.getParentFile().getName() + "." + f.getName());
                   }
               }
           }

        }
    }
}
