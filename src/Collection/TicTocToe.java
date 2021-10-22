package Collection;

import java.util.Scanner;

public class TicTocToe
{
    public static void main(String[] args) {


  //  String[] strings = new String[6];
      //  strings[0]= "amit";
     //   strings[1]= "sahil";
     //   strings[2]= "raj";
      //  strings[3]= "rakesh ";
      //  strings[4]= "ram";
       // strings[5]= "rahul";
      //  strings[6]= "rashmi";
  //  System.out.println(strings.length);

    String[][][] strings1 = new String[3][4][5];
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        strings1[0][0][1] = name;
        strings1[0][1][3] = "sahil";
        strings1[1][3][2] = "rashmi";
        strings1[2][0][1] = "rakesh";
        strings1[0][3][1] = "rahul";

        System.out.println( name);
        System.out.println(strings1[0][1][3]);



}
}
