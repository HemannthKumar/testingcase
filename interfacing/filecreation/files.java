package interfacing.filecreation;

import java.io.File;
import java.io.IOException;


public class files {

      public static void main(String[] args)throws IOException {
            File files=new File("C:\\Users\\shema\\OneDrive\\Desktop\\files\\example.txt");

	System.out.println(files.createNewFile());
      System.out.println(files.delete());


}
          
      }

   


