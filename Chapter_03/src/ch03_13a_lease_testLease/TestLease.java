/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/
package ch03_13a_lease_testLease;
import javax.swing.*;
/**
 * Project:      JP9
 * Module:       Chapter_03
 * Package:      ch03_13a_lease_testLease
 * File:         TestLease
 * Creator:      Kimberly Henry
 * Created on:   Mon, 19-Apr-2021
 * Created at:   1:45 AM
 * Create a class named TestLease whose main() method declares four Lease objects. Call a getData()
 * method three times. Within the method, prompt a user for values for each field for a Lease, and
 * return a Lease object to the main() method where it is assigned to one of main()’s Lease objects.
 * Do not prompt the user for values for the fourth Lease object, but let it continue to hold the
 * default values. Then, in main(), pass one of the Lease objects to a showValues() method that
 * displays the data. Then call the addPetFee() method using the passed Lease object and confirm
 * that the fee explanation statement is displayed. Next, call the showValues() method for the
 * Lease object again and confirm that the pet fee has been added to the rent. Finally, call the
 * showValues() method with each of the other three objects; confirm that two hold the values you
 * supplied as input and one holds the constructor default values. Save the application as
 * TestLease.java.
 */
public class TestLease
  {
    public static void main(String[] args)
      {
        Lease one = new Lease();
        Lease two = new Lease();
        Lease three = new Lease();
        Lease four = new Lease();
        getData(one);
        getData(two);
        getData(three);
        showData(one);
        one.addPetFee();
        showData(one);
        showData(two);
        showData(three);
        showData(four);
      }
    public static void getData(Lease data)
      {
        data.setTenantName(JOptionPane.showInputDialog(null, "Tenant Name",
            "TENANT NAME", JOptionPane.QUESTION_MESSAGE));
        data.setNumApartment(Integer.parseInt(JOptionPane.showInputDialog(null, "Apartment Number",
            "APARTMENT NUMBER", JOptionPane.QUESTION_MESSAGE)));
        data.setLeaseTerm(Integer.parseInt(JOptionPane.showInputDialog(null, "Lease Term", "LEASE TERM",
            JOptionPane.QUESTION_MESSAGE)));
        data.setAmountRent(Double.parseDouble(JOptionPane.showInputDialog(null, "Monthly Rent",
            "AMOUNT RENT", JOptionPane.QUESTION_MESSAGE)));
      }
    public static void showData(Lease data)
      {
        JOptionPane.showMessageDialog(null,
            "\nTenant Name:       " + data.getTenantName() +
            "\nApartment Number:  " + data.getNumApartment() +
            "\nLease Term:        " + data.getLeaseTerm() +
            "\nMonthly Rent:      " + data.getAmountRent(),
            "APARTMENT DETAILS", JOptionPane.INFORMATION_MESSAGE);
      }
  }
