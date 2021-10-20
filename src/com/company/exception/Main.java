package com.company.exception;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try {
            int z;
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            z = A - 14;
            if(A<=0){
                throw new Subtraction();
            }
            System.out.println(z);
        }
        catch (Subtraction ex){
            System.out.println("not possible");
        }

        finally{
            System.out.println("done");
        }
    }
}
