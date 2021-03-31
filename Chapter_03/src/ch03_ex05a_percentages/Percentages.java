/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex05a_percentages;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex05a_percentages
 * File:              Percentages
 * Creator:         Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:    4:59 AM
 * Create an application named Percentages whose main() method holds two double variables.
 * Assign values to the variables. Pass both variables to a method named computePercent() that
 * displays the two values, and the value of the first number as a percentage of the second one.
 * For example, if the numbers are 2.0 and 5.0, the method should display a statement similar
 * to 2.0 is 40 percent of 5.0. Then call the method a second time, passing the values in reverse
 * order. Save the application as Percentages.java
 */
public class Percentages
    {
        public static void main(String[] args)
            {
                double a = 5.0;
                double b = 9.0;
                System.out.println("Double a is " + a + "\nDouble b is " + b);
                System.out.println();
                computePercent(a, b);
                computePercent(b, a);
            }
        public static void computePercent(double a, double b)
            {
                double c = a / b;
                System.out.println(a + " is " + c + " % of " + b + ".");
            }
    }
