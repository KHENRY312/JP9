/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex02_boolean_values
File:              BooleanValues
Creator:        Kimberly Henry
Created on:   Wed, 17-Feb-2021
Created at:    7:01 AM
*/
package ch02_ex02_boolean_values;

public class BooleanValues
   {
      public static void main(String[] args)
         {
           System.out.println();
           System.out.println("Solutions To Chapter 2 Exercise 2");
           System.out.println();
           boolean isABoolean = 15 < 3;
           boolean isBBoolean = 8 <=  (2 + 6);
           boolean isCBoolean =  15 == 15;
           boolean isDBoolean = 3  >=  3;
           boolean isEBoolean = 4 * 2 == 2 * 4;
           boolean isFBoolean = 5 < 8 - 3;
           boolean isGBoolean = 7 != 7;
           boolean isHBoolean = 8 != (2 + 5);
           boolean isIBoolean = 10 - 20 == -10;
           boolean isJBoolean = 3 + 2 * 6 == 30;
           System.out.println("A. The boolean value of 15 < 13 is " + isABoolean);
           System.out.println("B. The boolean value of 8 <=5 (2 + 6) is " + isBBoolean);
           System.out.println("C. The boolean value of 15 == 15 is "  + isCBoolean);
           System.out.println("D. The boolean value of 3  >=  3 is " + isDBoolean);
           System.out.println("E. The boolean value of 4 * 2 == 2 * 4 is " + isEBoolean);
           System.out.println("F. The boolean value of 5 < 8 - 3 is " + isFBoolean);
           System.out.println("G. The boolean value of 7 != 7 is " + isGBoolean);
           System.out.println("H. The boolean value of 8 != (2 + 5) is " + isHBoolean);
           System.out.println("I.  The boolean value of 10 - 20 == -10 is " + isIBoolean);
           System.out.println("J.  The boolean value of 3 + 2 * 6 == 30 is " + isJBoolean);
            System.exit(0);
       }
   }
