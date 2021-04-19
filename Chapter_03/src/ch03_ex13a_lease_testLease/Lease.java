/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing
 your own assignments.
 **************************************************************************************************/
package ch03_ex13a_lease_testLease;
import javax.swing.*;
/**
 * Project:      JP9
 * Module:       Chapter_03
 * Package:      ch03_ex13a_lease_testLease
 * File:         Lease
 * Creator:      Kimberly Henry
 * Created on:   Mon, 19-Apr-2021
 * Created at:   12:37 AM
 * Create a class named Lease with fields that hold an apartment tenant’s name, apartment
 * number, monthly rent amount, and term of the lease in months. Include a constructor
 * that initializes the name to XXX, the apartment number to 0, the rent to 1000, and
 * the term to 12. Also include methods to get and set each of the fields. Include a
 * nonstatic method named addPetFee() that adds $10 to the monthly rent value and calls
 * a static method named explainPetPolicy() that explains the pet fee. Save the class as
 * Lease.java.
 */
public class Lease
  {
    String tenantName;
    int numApartment;
    double amountRent;
    int leaseTerm;
    public Lease()
      {
        tenantName = "XXX";
        numApartment = 0;
        amountRent = 1000.00;
        leaseTerm = 12;
      }
    public void setTenantName(String name)
      {
        tenantName = name;
      }
    public String getTenantName()
      {
        return tenantName;
      }
    public void setNumApartment(int apartment)
      {
        numApartment = apartment;
      }
    public int getNumApartment()
      {
        return numApartment;
      }
    public void setAmountRent(double rent)
      {
        amountRent = rent;
      }
    public double getAmountRent()
      {
        return amountRent;
      }
    public void setLeaseTerm(int term)
      {
        leaseTerm = term;
      }
    public int getLeaseTerm()
      {
        return leaseTerm;
      }
    public void addPetFee()
      {
        double petFee = 10.00;
        double totalRent = petFee + getAmountRent();
        setAmountRent(totalRent);
        explainPetPolicy();
      }
    public static void explainPetPolicy()
      {
        JOptionPane.showMessageDialog(null,"For all tenants with pets " +
            "\nthere is a 10.00 monthly pet fee.", "PET POLICY",
            JOptionPane.INFORMATION_MESSAGE);
      }
  }
