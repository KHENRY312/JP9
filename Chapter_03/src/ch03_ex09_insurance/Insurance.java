/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex09_insurance;

import javax.swing.*;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex09_insurance
 * File:              Insurance
 * Creator:         Kimberly Henry
 * Created on:   Thu, 01-Apr-2021
 * Created at:    3:35 AM
 * The Harrison Group Life Insurance company computes annual policy premiums based on the age the
 * customer turns in the current calendar year. The premium is computed by taking the decade of the
 * customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360,
 * which is calculated by adding the decades (3) to 15, and then multiplying by 20. Write an application
 * that prompts a user for the current year and a birth year. Pass both to a method that calculates and
 * returns the premium amount, and then display the returned amount. Save the application as
 * Insurance.java.
 */
public class Insurance
   {
      public static void main(String[] args)
         {
            int currentYear = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the current year?  ",
                  "CURRENT YEAR", JOptionPane.QUESTION_MESSAGE));
            int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the participants age?  ",
                  "CLIENTS AGE", JOptionPane.QUESTION_MESSAGE));
            double monthlyPremium = calculatePremium(currentYear, birthYear);
            JOptionPane.showMessageDialog(null, "Your monthly premium will be " + monthlyPremium + ".",
                  "MONTHLY PREMIUM", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
      public static double calculatePremium(int y, int a)
         {
            final int DECADE = 10;
            final double PREMIUM_VALUE = 20.00;
            int decadeAge = (y - a);
            int premiumAge = ((decadeAge / DECADE) + 15);
            double premium;
            premium = premiumAge * PREMIUM_VALUE;
            return premium;
         }
   }
