/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex08_inches_to_feet
File:              InchesToFeet
Creator:        Kimberly Henry
Created on:   Fri, 19-Feb-2021
Created at:    4:24 PM
*/
package ch02_ex08_inches_to_feet;

public class InchesToFeet
   {
      public static void main(String[] args)
         {
            final int FEET = 36;
            var inch = 125;
            var inchFeet = inch / FEET;
            var inchRemain = inch % FEET;
            System.out.println("There is " + inchFeet + " feet and " +
                  inchRemain + " inches remaining in " + inch + " inches.");
         }
   }
