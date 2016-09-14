package com.brainacad.laboratorys2_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by KrevSaa on 14.09.2016.
 * Write a program that computes the distance an object will fall in Earth's gravity.
 Create a new class called GravityCalculator with method calcDist(double t) that takes double  t,
 and returns the the position of an object after falling for t seconds (outputting the position in meters).
 The formula in Math notation is:
 x(t) = 0.5 × at 2 + vit + xi
 Where:
 a - Acceleration (m/s 2 ) =-9.81
 t - Time (s) (for example t=10)
 vi Initial velocity (m/s) =0
 xi Initial position =0
 Declare Acceleration value field as a constant;

 */
class GravityCalculator{
    private static final double ACCELERATION = 9.81;
    private static double v = 0;
    private static double x = 0;

    public static double  calcDist(double t){
        return ( 0.5 * ACCELERATION*(t*t) + v * t + x );
    }
}
public class Laboratory2_4_7 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter falling time: ");

        System.out.println("Object fall " + GravityCalculator.calcDist(Double.parseDouble(bufferedReader.readLine())) + " meters");

    }



}
