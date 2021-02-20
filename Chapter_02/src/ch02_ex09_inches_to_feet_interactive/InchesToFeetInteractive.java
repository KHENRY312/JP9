/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex09_inches_to_feet_interactive
File:              InchesToFeetInteractive
Creator:        Kimberly Henry
Created on:   Fri, 19-Feb-2021
Created at:    8:19 PM
*/
package ch02_ex09_inches_to_feet_interactive;

import javax.swing.*;

public class InchesToFeetInteractive
   {
      public static void main(String[] args)
         {
            final int FEET = 36;
            var feetTraveled = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Enter feet traveled -->  ", "FEET TRAVELED",
                  JOptionPane.INFORMATION_MESSAGE));
            var totalFeet = feetTraveled / FEET;
            var feetRemain = feetTraveled % FEET;
            JOptionPane.showMessageDialog(null, "Total feet of " + feetTraveled + " feet is  \n" +
                  "" + totalFeet + " feet and " + feetRemain + " inches.");
         }
   }
