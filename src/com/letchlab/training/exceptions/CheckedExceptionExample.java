package com.letchlab.training.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Checked Exceptions only and only happens in Compile Time.
 */
public class CheckedExceptionExample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("No File here");
        try
        {
            FileInputStream stream = new FileInputStream(file);
            //throw new FileNotFoundException("this is explicit message exception");

        } catch (FileNotFoundException fx) {
            //System.out.println("Catch the exceptions !!");
            throw new FileNotFoundException("this is explicit message exception");

        }
        finally
        {
            System.out.println("Proceeding with next steps !!");
        }
    }

}
