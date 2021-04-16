/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex11a_sandwich_and_test_sandwich;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex11a_sandwich_and_test_sandwich
 * File:              Sandwich
 * Creator:         Kimberly Henry
 * Created on:   Fri, 16-Apr-2021
 * Created at:    5:28 PM
 * Create a class named Sandwich. Data fields include a String for the main ingredient (such as
 * tuna), a String for bread type (such as wheat), and a double for price (such as 4.99). Include
 * methods to get and set values for each of these fields. Save the class as Sandwich.java.
 */
public class Sandwich
   {
      private String fillingType;
      private String breadType;
      private double costSandwich;
      public String getFillingType()
         {
            return fillingType;
         }
      public void setFillingType(String filling)
         {
            fillingType = filling;
         }
      public String getBreadType()
         {
            return breadType;
         }
      public void setBreadType(String bread)
         {
            breadType = bread;
         }
      public double getCostSandwich()
         {
            return costSandwich;
         }
      public void setCostSandwich(double cost)
         {
            costSandwich = cost;
         }
   }
