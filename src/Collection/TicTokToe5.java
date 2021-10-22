package Collection;

import java.util.Scanner;

public class TicTokToe5
{
    public static void main(String[] args) {
        int ary[][]= new int[3][3];
        ary[0][0]=12;
        ary[0][1]=35;
        ary[0][2]=13;
        ary[1][0]= 44;
        ary[1][1]=50;
        ary[1][2]=77;
        ary[2][0]=11;
        ary[2][1]=80;
        ary[2][2]=45;

        for (int i=0;i<3;i++){      // for rows
            for (int j = 0; j<3; j++){    // for column

                System.out.print(ary[i][j] + "      ");
            }
            System.out.println();
        }



    }
}
