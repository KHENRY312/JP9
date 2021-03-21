/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Game_Zone
Package:       ch02_gz03_random_guess_match
File:              RandomGuessMatch
Creator:        Kimberly Henry
Created on:   Tue, 23-Feb-2021
Created at:    11:58 PM
*/
package ch02_gz03_random_guess_match;

import javax.swing.*;

public class RandomGuessMatch
   {
      public static void main(String[] args)
         {
            final int MIN = 1;
            final int MAX = 10;
            int random = MIN + (int) (Math.random() * MAX);
            int guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Guess a number between 1 and 10",
                  "GUESS NUMBER", JOptionPane.QUESTION_MESSAGE));
            JOptionPane.showMessageDialog(null, "You Guessed " + guess +
                        "\nThe correct number is " + random +
                        "\nThere is a difference of " + (random - guess) + ".",
                  "GUESS RESULT", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
   }
