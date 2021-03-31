/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex01_legal_math_methods;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex01_legal_method_calls
 * File:              LegalMethodCalls
 * Creator:         Kimberly Henry
 * Created on:   Tue, 30-Mar-2021
 * Created at:    1:35 AM
 */
public class LegalMathMethods<x>
   {
      public static void main(String[] args)
         {
            int x = 2;
            int y = 3;
            System.out.println();
            mathMethod(x);
            System.out.println("int y = " + y);
            System.out.println("A.  mathMethod(x) is a valid method call.");
            System.out.println("B.  mathMethod(y) is a valid method call.");
            System.out.println("C.  mathMethod(x, y) is invalid; the method because it uses  " +
                  "two  parameters instead of one.");
            System.out.println("D.  mathMethod(x + y) is a valid method call because the final " +
                  "result of the calculation results in an int.");
            System.out.println("E.  mathMethod(12L) is an invalid method call because the data " +
                  "type referenced is a long and not an integer");
            System.out.println("F.  mathMethod(12) is a valid method call.");
            System.out.println("G.  mathMethod(12.2) is an invalid method call because the " +
                  "parameter is a double and not an integer");
            System.out.println("H.  mathMethod() is an invalid method call because no " +
                  "parameter has been provided.");
            System.out.println("I.  mathMethod(a) is an invalid method call because the " +
                  "parameter a is not defined in the class");
            System.out.println("J.  mathMethod(a / x) is an invalid method call because the " +
                  "parameter a is not defined in the class");
            System.exit(0);
         }
      public static void mathMethod(int x)
         {
            System.out.println("int x = " + x);
         }
   }
