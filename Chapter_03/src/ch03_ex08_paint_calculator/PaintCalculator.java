/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex08_paint_calculator;

import java.util.Scanner;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex08_paint_calculator
 * File:              PaintCalculator
 * Creator:         Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:    8:11 PM
 * Assume that a gallon of paint covers about 350 SQFT 32.52 m of wall space.
 * Create an application with a main() method that prompts the user for the length, width, and
 * height of a rectangular room. Pass these three values to a method that does the following:
 * Calculates the wall area for a room.
 * Passes the calculated wall area to another method that calculates and returns the number of
 * gallons of paint needed.
 * Displays the number of gallons needed
 * Computes the price based on a paint price of 32 per the gallon and assuming that the painter can
 * buy any fraction of a gallon of paint at the same price as a whole gallon
 * Returns the price to the main() method The main() method displays the final price.
 * For example, the cost to paint a 15 by 20-foot room with 10 foot ceilings is 64. Save the application
 * as PaintCalculator.java.
 */
public class PaintCalculator
   {
      final static int WALL_AREA = 350;
      final static double PAINT = 32.00;
      static double length;
      static double width;
      static double height;
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the length of the room:  ");
            length = keyboard.nextDouble();
            System.out.print("Enter the width of the room:  ");
            width = keyboard.nextDouble();
            System.out.print("Enter the height of the room:  ");
            height = keyboard.nextDouble();
            calculatePaintRequired();
         }
      public static double calculateRoomArea(double l, double w, double h)
         {
            final int WALLS = 2;
            double totalLength = l * WALLS;
            double totalWidth = w * WALLS;
            return (totalLength + totalWidth) * h;
         }
      public static void calculatePaintRequired()
         {
            int gallonsRequired = (int) calculateRoomArea(length, width, height) / WALL_AREA;
            double paintCost = gallonsRequired * PAINT;
            System.out.println("For a room of " + calculateRoomArea(length, width, height) + " square feet, it will " +
                  "take " + gallonsRequired + " gallons of paint. " +
                  "\nAt a cost of " + PAINT + " per gallon, it will cost " + paintCost + " dollars.");

         }
   }
