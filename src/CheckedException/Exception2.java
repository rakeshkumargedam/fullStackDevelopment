package CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        /*String A = "tv";
        String B = "remote";
        String C = "light";
        String d = null; */


        File file = new File("abcdc");
        FileInputStream stream = new FileInputStream(file);

       // try{
       //     d.length();
       // }catch (NullPointerException ex){
        //     System.out.println(ex.getMessage());
            System.out.println("lighterror");
      //   }
      // try {
      //    d.length();
    //  }catch (NullPointerException ex){
    //       throw new NullPointerException(ex.getMessage());


        }
        //System.out.println("remote is not working");
    }

//}
