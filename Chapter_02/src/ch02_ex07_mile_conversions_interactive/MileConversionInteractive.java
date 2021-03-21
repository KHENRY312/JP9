/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex07_mile_conversions_interactive
File:              MileConversionInteractive
Creator:        Kimberly Henry
Created on:   Fri, 19-Feb-2021
Created at:    3:54 PM
*/
package ch02_ex07_mile_conversions_interactive;

import javax.swing.*;

public class MileConversionInteractive
   {
      public static void main(String[] args)
         {
            final int YARDS = 1760;
            final int FEET = 5280;
            final int INCHES = 63360;
            int miles = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Enter a value of miles -->  ", "MILES ENTRY",
                  JOptionPane.QUESTION_MESSAGE));
            int milesYard = miles * YARDS;
            int milesFeet =  miles * FEET;
            int milesInches = miles * INCHES;
            JOptionPane.showMessageDialog(null, "Total yards in miles is " + milesYard + " yards. \n" +
                  "Total feet in miles is " + milesFeet + " feet. " +
                  "\nTotal inches in a mile is " + milesInches + " inches.");
            System.exit(0);
         }
   }
