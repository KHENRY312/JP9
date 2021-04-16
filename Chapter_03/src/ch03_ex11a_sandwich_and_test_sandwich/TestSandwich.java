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
 * File:              TestSandwich
 * Creator:         Kimberly Henry
 * Created on:   Fri, 16-Apr-2021
 * Created at:    5:47 PM
 * Create an application named TestSandwich that instantiates one Sandwich object and
 * demonstrates the use of the set and get methods. Save this application as TestSandwich.java.
 */
public class TestSandwich
   {
      public static void main(String[] args)
         {
            Sandwich mySandwich = new Sandwich();
            mySandwich.setFillingType("tuna");
            mySandwich.setBreadType("white");
            mySandwich.setCostSandwich(5.99);
            System.out.println("\nI ordered a " +
                  mySandwich.getFillingType() + " sandwich on " +
                  mySandwich.getBreadType() + " bread, which will cost $" +
                  mySandwich.getCostSandwich() + ".");
         }
   }
