/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex06_mile_conversions
File:              MileConversions
Creator:        Kimberly Henry
Created on:   Thu, 18-Feb-2021
Created at:    11:33 AM
*/
package ch02_ex06_mile_conversions;

public class MileConversions
   {
      public static void main(String[] args)
         {
            final int YARDS = 1760;
            final int FEET = 5280;
            final int INCHES = 63360;
            int miles = 125;
            System.out.println("In " + miles + " there is " + (miles * YARDS) +  " yards or \n" + (miles * FEET) +
                  " feet or " + (miles * INCHES) + " inches. ");
         }
   }
