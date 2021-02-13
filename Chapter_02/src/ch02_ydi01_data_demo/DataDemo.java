/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 ***************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi01_declaring_and_using_a_variable
File:              DataDemo
Creator:        Kimberly Henry
Created on:   Thu, 11-Feb-2021
Created at:    4:05 AM
*/
package ch02_ydi01_data_demo;

public class DataDemo
   {
      public static void main(String[] args)
         {
            final int STATES_IN_US = 50;
            int aWholeNumber = 315;
            System.out.print("The number is ");
            System.out.println(aWholeNumber + ".");
            System.out.println("The number of states is " + STATES_IN_US + ".");
            System.exit(0);
         }
   }
