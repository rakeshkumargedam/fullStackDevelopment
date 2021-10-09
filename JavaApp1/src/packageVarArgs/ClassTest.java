/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageVarArgs;

/**
 *
 * @author rahul
 */
public class ClassTest
{
    public static int sum(int... x)
    {
        int total = 0;
        for(int x1 : x)
        {
            total += x1;
        }
        return total;
    }
    public static void main(String[] args)
    {
        System.out.println(sum());
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
}
    
}
