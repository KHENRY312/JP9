/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex13_chili_to_go_profit
File:              ChiliToGoProfit
Creator:        Kimberly Henry
Created on:   Fri, 19-Feb-2021
Created at:    11:58 PM
*/
package ch02_ex13_chili_to_go_profit;

import javax.swing.*;

public class ChiliToGoProfit
   {
      public static void main(String[] args)
         {
            final double ADULT_MEAL = 7.00;
            final double CHILD_MEAL = 4.00;
            final double ADULT_COST = 4.35;
            final double CHILD_COST = 3.10;


            //Meals ordered, input required.
            int adultOrder = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "How many Adult Meals would you like?  ", "ADULT MEALS",
                  JOptionPane.QUESTION_MESSAGE));
            int childOrder = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "How many Child's Meals would you like?  ", "CHILD MEALS",
                  JOptionPane.QUESTION_MESSAGE));

            //Calculations of each meal.
            double adultPrice = adultOrder * ADULT_MEAL;
            double childPrice = childOrder * CHILD_MEAL;
            double totalOrder = adultPrice + childPrice;
            double profitAdult = ADULT_MEAL - ADULT_COST;
            double profitChild = CHILD_MEAL - CHILD_COST;
            double totalAdultProfit = profitAdult * adultOrder;
            double totalChildProfit = profitChild *childOrder;
            double profit = totalAdultProfit + totalChildProfit;


            //Display order total and calculations
            JOptionPane.showMessageDialog(null, "Total Adult Order " + adultPrice + "." +

                        "\nTotal Child's Orders " + childPrice + "." +
                        "\nTotal Order Cost " + totalOrder + "." +
                        "\nTotal Profit Adult meals are " + Math.round(totalAdultProfit * 100) / 100 + "." +
                        "\nTotal Profit Child's meals are " + (Math.round(totalChildProfit * 100) / 100) + "." +
                        "\nTotal Profit for Order is " + (Math.round(profit * 100) / 100) + ".",
                  "TOTAL ORDERS",
                  JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

         }
   }
