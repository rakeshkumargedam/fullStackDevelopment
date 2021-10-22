package Collection;

import java.util.Scanner;

public class TicTokToe4
{
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int rows =0,columns=0;
        System.out.println("Enter numbers of rows");
        rows = sr.nextInt();
        System.out.println("Enter numbers of columns");
        columns=sr.nextInt();
        int arry[][]=new int[rows][columns];

        for (int i=0; i<rows; i++){
            for (int j=0;j<columns; j++){

                arry[i][j]=sr.nextInt();
            }
        }
      //  int arry [][]=new int[2][2];
      //  arry[0][0]= 2;
       // arry[0][1]= 5;
     //   arry[1][0]= 9;
       // arry[1][1]= 3;

        for (int i=0;i<rows; i++){
            for (int j=0;j<columns; j++){

                System.out.print(arry[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
