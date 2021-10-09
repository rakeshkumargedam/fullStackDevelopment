/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp1;

/**
 *
 * @author rahul
 */
public class JavaApp1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x;
        if(args.length > 0)
        {
            x = 10;
        }
        else
        {
            x = 20;
        }
        System.out.println("x : "  +x);
    }
    
}
