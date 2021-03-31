/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex07_inch_conversion;

import java.util.Scanner;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex07_inch_conversion
 * File:              InchConversion
 * Creator:         Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:    6:50 PM
 * There are twelve inches in a foot and three feet in a yard. Create a class named InchConversion.
 * Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the
 * entered value to two methods. One converts the value from inches to feet, and the other converts
 * the same value from inches to yards. Each method displays the results with appropriate
 * explanation. Save the application as InchConversion.java.
 */
public class InchConversion
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please Enter a Value in Inches:  ");
            int inches = keyboard.nextInt();
            inchesToFeet(inches);
            inchesToYard(inches);
         }
      public static void inchesToFeet(int i)
         {
            final int FEET = 12;
            int feet_in_inch = i / FEET;
            System.out.println("There is " + feet_in_inch + " feet in " + i + " inches.");
         }
      public static void inchesToYard(int i)
         {
            final int FEET = 12;
            final int YARDS = 3;
            int feet_in_inch = i / FEET;
            int yards_in_feet = feet_in_inch / YARDS;
            System.out.println("There is " + yards_in_feet + " yards in " + feet_in_inch + " feet or " + i + " inches.");
         }
   }
