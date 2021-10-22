package Collection;

import java.util.Scanner;

public class TicTokToe3
{
    public static void main(String[] args) {

       int myarr[][]=new int[3][3];
        myarr[0][0] = 10;
        myarr[0][1] = 45;
        myarr[0][2] = 30;
        myarr[1][0] = 50;
        myarr[1][1] = 70;
        myarr[1][2] = 35;
        myarr[2][0] = 12;
        myarr[2][1] = 75;
        myarr[2][2] = 52;

        for (int i=0;i<3;i++){      // for rows
            for (int j = 0; j<3; j++){    // for column

                System.out.print(myarr[i][j] + "    ");

            }
            System.out.println();
        }
    }
}




