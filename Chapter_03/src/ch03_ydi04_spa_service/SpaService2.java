/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:      JP9
Module:       Chapter_03
Package:      ch03_ydi04_spa_service
File:         SpaService2
Creator:      Kimberly Henry
Created on:   Sat, 06-Mar-2021
Created at:   6:27 PM
*/
package ch03_ydi04_spa_service;

public class SpaService2
   {
      private String serviceDescription;
      private double price;

      public SpaService2()
         {
            serviceDescription = "XXX";
            price = 0;
         }
      public void setServiceDescription(String service)
         {
            serviceDescription = service;
         }
      public void setPrice(double servicePrice)
         {
            price = servicePrice;
         }
      public String getServiceDescription()
         {
            return serviceDescription;
         }
      public double getPrice()
         {
            return price;
         }
   }
