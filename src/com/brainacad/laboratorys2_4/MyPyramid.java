package com.brainacad.laboratorys2_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by KrevSaa on 14.09.2016.Write a class MyPyramid with public static method printPyramid(int h)
 * that takes parameter an integer h between 1 and 9, and prints a pyramid of numbers of height h.
 Example: For h = 4 the method should print the pyramid

 1
 121
 12321
 1234321

 *
 */
public class MyPyramid {
    public static void printPyramid(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j > 0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        int h;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter H between 1 ans 9:");
        h = Integer.parseInt(bufferedReader.readLine());

        if ( (h <= 9) & (h >= 1)) printPyramid(h);
                else  System.out.println("H must be between 1 ans 9!");
    }
}
