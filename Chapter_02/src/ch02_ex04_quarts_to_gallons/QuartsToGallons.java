/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex04_quarts_to_gallons
File:              QuartsToGallons
Creator:        Kimberly Henry
Created on:   Wed, 17-Feb-2021
Created at:    3:24 PM
*/
package ch02_ex04_quarts_to_gallons;

public class QuartsToGallons
   {
      public static void main(String[] args)
         {
            final int QUARTS_IN_GALLON = 4;
            int quartNeeded = 18;
            int gallonsRequired = quartNeeded / QUARTS_IN_GALLON;
            int quartsRequired = quartNeeded % QUARTS_IN_GALLON;
            System.out.println("To paint this room it will require " + gallonsRequired +
                  " gallons and " + quartsRequired +  " quarts ." );
         }
   }
