package com.brainacad.laboratorys2_4;

import java.util.Arrays;

/**
 * Created by Таня on 13.09.2016.
 * Create class MyMath with two static methods (findMin and findMax), which will take array of int values  as argument
 * and return minimum element value (for findMin method) or  maximum element value (for findMax method).
 *
 * Add to class MyMath final static field PI = 3.14 and static method areaOfCircle, which will take radius,
 * use constant PI and calculate area.
 *
 * The value of π can be calculated with the series:  π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
   Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n,
   and computes and returns the value of π approximated to the first n terms of the series.

 */
class MyMath {

    public final static double PI = 3.14;


    public static int findMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double areaOfCircle(int radius) {
        return PI * radius * radius;
    }

    public static double calcPi(int n) {
        /** double pi;
         if (n == 1) return 4/i;
         if (n == 2) return 4-4/i+2;
         for (int i = 1; i <=n; i += 2) {

         }
         return calcPi(n - 1) + calcPi(n-2); */
        if (n <= 0) {
            System.out.println("Error. N must be > 0");
            return Integer.MIN_VALUE;
        }

        double pi = 0;
        int plusMinus = 1;
        for (int i = 1; i <= n; i += 2) {
            pi += (4.0D / i * plusMinus);
            plusMinus = plusMinus * (-1);
        }
        return pi;
    }
}

public class Laboratory2_4_1 {
    public static void main(String[] args) {
        System.out.println(MyMath.calcPi(-10));
    }
}

