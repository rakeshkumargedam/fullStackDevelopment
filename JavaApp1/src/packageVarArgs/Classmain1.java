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
public class Classmain1
{
    public static void m(int...x)
    {
        System.out.println("inside int...");
    }
//    public static void m(int[] x)
//    {
//        System.out.println("insisde int[]");
//    }
    
    public static void main(String[] args)
    {
        m();
        m(10);
        m(12, 13);
    }
}
