package CheckedException;

import java.io.File;

public class CheckedException
{
    public static void main(String[] args) throws GunsNotFunde
    {
        String a = "gun" ;
        String b = "ammo";
        String c = null;
       // int c = 12345;
        String d = null;
        try{
            int length = d.length();
        }catch (NullPointerException ex){
            System.out.println("given value of string is null");
        }
        try {
            c.length();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        try {
            int e = 12345/0;
        }catch (Exception ex){
            throw new ArithmeticException(ex.getMessage());
          //  System.out.println(ex.getMessage());
     }
        System.out.println("test");

    }
}
