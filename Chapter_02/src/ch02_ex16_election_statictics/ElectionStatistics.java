/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex16_election_statictics
File:              ElectionStatistics
Creator:        Kimberly Henry
Created on:   Sat, 20-Feb-2021
Created at:    5:01 AM
*/
package ch02_ex16_election_statictics;

import javax.swing.*;

public class ElectionStatistics
   {
      public static void main(String[] args)
         {
            int obama = 570;
            int bush =  285;
            int trump = 143;
            int totalVotes = obama + trump + bush;
            double percentObama = ((double) obama / totalVotes);
            double percentTrump =  (double) trump / totalVotes;
            double percentBush = (double) bush / totalVotes;
            JOptionPane.showMessageDialog(null,
                  "Barak Obama                     " + Math.round(percentObama * 100) + "%" +
                        "\nDonald J. Trump                " +Math.round(percentTrump * 100) + "%" +
                        "\nGeorge W. Bush                " + Math.round(percentBush * 100) + "%",
                  "MAYORAL ELECTION RESULTS", JOptionPane.INFORMATION_MESSAGE);
         }
   }
