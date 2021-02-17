/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex01_numeric_values
File:              NumericValues
Creator:        Kimberly Henry
Created on:   Wed, 17-Feb-2021
Created at:    5:15 AM
*/
package ch02_ex01_numeric_values;

public class NumericValues
   {
      public static void main(String[] args)
         {
            System.out.println();
            System.out.println("Solutions to Chapter 2 Exercise 1");
            int a = 4, b = 6, c = 2;
            System.out.println();
            System.out.println("A.  " + a + " + " + b + " * " + c + " = " + (a + (b * c)));
            a = 10;
            b = 5;
            c = 8;
            System.out.println("B.  " + a + " / " + b + " + " + c + " = " + (a / b + c));
            a = 12;
            b = 4;
            c = 16;
            int d = 2;
            System.out.println("C.  " + a + " / " + b + " + " + c + " / " + d + " = " + ((a / b) + (c / d)));
            a = 17;
            b = 2;
            System.out.println("D.  " + a + " / " + b +  " = " + (a / b ));
            a = 22;
            b = 5;
            System.out.println("E.  " + a + " / " + b +  " = " + (a / b ));
            a = 39;
            b = 10;
            System.out.println("F.  " + a + " / " + b +  " = " + (a / b ));
            a = 19;
            b = 2;
            c = 3;
            System.out.println("G.  " + a + " % " + b + " + " + c + " = " + (a % ( b + c)));
            a = 3;
            b = 4;
            c = 20;
            d = 3;
            System.out.println("H.  " + a + " + " + b + " * " + c + " / " + d + " = " + (a + b * c / d));
            a = 36;
            b = 6;
            c = 2;
            System.out.println("I.  " + a + " % " + b + " + " + c + " = " + (a % (b + c)));
            a = 8;
            b = 2;
            c = 0;
            System.out.println("J.  " + a + " % " + b + " * " + c + " = " + (a / b + c));
         }
   }
