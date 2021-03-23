/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch0_ex11_eggs
File:              Eggs
Creator:        Kimberly Henry
Created on:   Fri, 19-Feb-2021
Created at:    8:42 PM
Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen
eggs or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a
user for the number of eggs in the order and then display the amount owed with a full explanation.
 For example, the typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen
 and 3 loose eggs at 45 cents each for a total of $7.85. Save the program as Eggs.java.
*/
package ch02_ex11_eggs;

import javax.swing.*;

public class Eggs
   {
      public static void main(String[] args)
         {
            //Variables required
            final double DOZEN_COST = 3.25;
            final double SINGLE_COST = 0.45;
            final int DOZEN = 12;

            //User input
            int eggsOrdered = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total eggs " +
                  "ordered --> ", "EGGS ORDERED",
                  JOptionPane.QUESTION_MESSAGE ));

            //Calculations of cost
            int dozensOrdered =  eggsOrdered / DOZEN;
            int singlesOrdered = eggsOrdered % DOZEN;
            double costDozen = dozensOrdered * DOZEN_COST;
            double costSingles = singlesOrdered * SINGLE_COST;
            double totalOrder = costDozen + costSingles;

            //Order details for user.
            JOptionPane.showMessageDialog(null, "Your order of " + eggsOrdered + " eggs will come to " +
                        "" + dozensOrdered + " dozens and " + singlesOrdered + " singles. \n" +
                        " At the cost of " + DOZEN_COST + " per dozen and " + SINGLE_COST + " cents per single egg,  \n" +
                        " your order will cost " + costDozen + " for the dozens and " + costSingles + ".\n" +
                        " The total cost will be " + totalOrder + ".",
                  " TOTAL ORDER", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
      }
   }
