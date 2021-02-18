/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex05_quarts_to_gallon_interactive
File:              QuartsToGallonInteractive
Creator:        Kimberly Henry
Created on:   Thu, 18-Feb-2021
Created at:    10:55 AM
*/
package ch02_ex05_quarts_to_gallon_interactive;

import javax.swing.*;

public class QuartsToGallonInteractive
   {
      public static void main(String[] args)
         {
            final int QUARTS_IN_GALLON = 4;
            int quartNeeded = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Enter quarts needed to paint room",
                  "QUARTS NEEDED", JOptionPane.QUESTION_MESSAGE));
            int gallonsRequired = quartNeeded / QUARTS_IN_GALLON;
            int quartsRequired = quartNeeded % QUARTS_IN_GALLON;
            JOptionPane.showMessageDialog(null, "It will require " + gallonsRequired + " gallons and " +
                  "\n  " + quartsRequired +  " quarts to paint the room.", "PAINT REQUIRED",
                  JOptionPane.INFORMATION_MESSAGE);
         }
   }
