package com.brainacad.laboratorys2_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.brainacad.laboratorys2_4.MyMath.findMax;
import static com.brainacad.laboratorys2_4.MyMath.findMin;

/**
 * Created by Таня on 13.09.2016.
 * Create class Calculation, which will create two arrays of integers
 * and use findMin and findMax static methods of MyMath class.
 */

class Calculation {

    public static int[] fillArray(int length) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter the element number " + i+1 + ":");
            array[i] = Integer.parseInt(bufferedReader.readLine());
            System.out.println();
        }
        return array;
    }

}

public class Laboratory2_4_2 {
    public static void main(String[] args) throws Exception {
        int[] array1, array2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter lengths of the first array:");
        array1 = new int[Integer.parseInt(bufferedReader.readLine())];
        array1 = Calculation.fillArray(array1.length);

        System.out.println("Minimum value of the first array:" + findMin(array1));
        System.out.println("Maximum value of the first array:" + findMax(array1));

        System.out.println("Please enter lengths of the first array:");
        array2 = new int[Integer.parseInt(bufferedReader.readLine())];
        array2 = Calculation.fillArray(array2.length);

        System.out.println("Minimum value of the first array:" + findMin(array2));
        System.out.println("Maximum value of the first array:" + findMax(array2));

    }
}
