/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_03
Package:       ch03_ydi04_spa_service
File:              CreateSpaServices2
Creator:        Kimberly Henry
Created on:   Sat, 06-Mar-2021
Created at:    7:48 PM
*/

package ch03_ydi04_spa_service;

import java.util.Scanner;

public class CreateSpaServices2
   {
      public static void main(String[] args)
         {
            SpaService2 firstService2 = new SpaService2();
            SpaService2 secondService2 = new SpaService2();
            getData(firstService2);
            getData(secondService2);
            System.out.println("First Service Details");
            System.out.println(firstService2.getServiceDescription() + " $" + firstService2.getPrice());
            System.out.println();
            System.out.println("Second Service Details");
            System.out.println(secondService2.getServiceDescription() + " $" + secondService2.getPrice());
            System.exit(0);
         }
      public static SpaService2 getData(SpaService2 service2)
         {
            String description;
            double price;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter service name --> ");
            description = keyboard.nextLine();
            System.out.println("Enter price of service --> ");
            price = keyboard.nextDouble();
            service2.setServiceDescription(description);
            service2.setPrice(price);
            return service2;
         }
   }
