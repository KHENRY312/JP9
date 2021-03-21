/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch02_db04_fix_debug_two4;

import javax.swing.*;
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog(null,
         "Enter price of item you are buying", "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null, "With " + TAX * 100 +
            "% tax,  purchase  is $" + (cost + cost * TAX));
      System.exit(0);
   }
}
