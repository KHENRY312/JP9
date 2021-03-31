/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex05b_percentages2;

import java.util.Scanner;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex05b_percentages2
 * File:              Percentages2
 * Creator:         Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:    9:01 AM
 */
public class Percentages2
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter a double:  ");
            double a = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.print("Enter another double, please:  ");
            double b = keyboard.nextDouble();
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
