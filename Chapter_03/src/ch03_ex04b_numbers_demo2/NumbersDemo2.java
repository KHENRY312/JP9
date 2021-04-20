/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex04b_numbers_demo2;

import java.util.Scanner;

/**
 * Project:      JP9
 * Module:       Chapter_03
 * Package:      ch03_ex04b_numbers_demo2
 * File:         NumbersDemo2
 * Creator:      Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:   4:29 AM
 * Modify the NumbersDemo class to accept the values of the two integers from a user at the
 * keyboard. Save the file as NumbersDemo2.java.
 */
public class NumbersDemo2
   {
      public static void main(String[] args)
         /**Create an application named  NumbersDemo whose main() method holds
          two integer variables. Assign values to the variables*/
      {
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Enter any integer:  ");
         int a = keyboard.nextInt();
         keyboard.nextLine();
         System.out.print("Enter another integer:  ");
         int b = keyboard.nextInt();
         keyboard.close();
         System.out.print("\nInteger a is " + a + "\nInteger b is " + b);
         System.out.println();
         System.out.println("\nDisplay Twice The Number: ");
         displayTwiceTheNumber(a, b);
         System.out.println("Display Number Plus Five: ");
         displayNumberPlusFive(a, b);
         System.out.println("Display Number Squared: ");
         displayNumberSquared(a, b);
         System.exit(0);
      }

      public static void displayTwiceTheNumber(int a, int b)
         /**Pass each value to a method named displayTwiceTheNumber().  Create a method to perform
          * the task its name implies.
          */
      {
         final int VALUE = 2;
         int c = VALUE * a;
         int d = VALUE * b;
         System.out.println(a + " times two is " + c + ".");
         System.out.println(b + " times two is " + d + ".");
         System.out.println();
      }

      public static void displayNumberPlusFive(int a, int b)
         /**Pass each value to a method named displayNumberPlusFive().  Create the method to
          * perform the task its name implies. Save the application as NumbersDemo.java.
          */
      {
         final int VALUE = 5;
         int c = VALUE + a;
         int d = VALUE + b;
         System.out.println(a + " plus five is " + c + ".");
         System.out.println(b + " plus five is " + d + ".");
         System.out.println();
      }

      public static void displayNumberSquared(int a, int b)
         /**Pass each value to a method named displayNumberSquared(). Create each method to
          * perform the task its name implies. Save the application as NumbersDemo.java.
          */
      {
         int c = a * a;
         int d = b * b;
         int e = (int) Math.sqrt(a);
         int f = (int) Math.sqrt(b);
         System.out.println(a + " squared is " + c + "; however the square root of " + a + " is " + e + ".");
         System.out.println(b + " squared is " + d + "; however the square root of " + b + " is " + f + ".");
         System.out.println();
      }
   }
