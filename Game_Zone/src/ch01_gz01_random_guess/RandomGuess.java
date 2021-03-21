/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Game_Zone
Package:       ch01_gz01_random_guess
File:              RandomGuess
Creator:        Kimberly Henry
Created on:   Tue, 23-Feb-2021
Created at:    8:11 PM
*/
package ch01_gz01_random_guess;

import javax.swing.*;

public class RandomGuess
   {
      public static void main(String[] args)
         {
            JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.",
                  "GUESS NUMBER",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "The number is " + (1 + (int) (Math.random() * 10) + "."),
                  "RANDOM NUMBER", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
   }
