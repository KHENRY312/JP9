/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch01_ex09_triangle;
import javax.swing.*;
/*
Project:  JP9
Module:   Chapter_01
Package:  ch01_ex09_triangle
File:     Triangle
Creator:  Kimberly Henry
Created:  Mon, 01-Feb-2021
*/
public class Triangle
  {
    public static void main(String[] arg)
      {
        JOptionPane.showMessageDialog (null, "              *" +
                "\n           * *  *" +
                "\n        * *  *  *  *" +
                "\n     * * * * * * * *" +
                "\n   * * * * * * * * * *" +
                "\n * * * * * * * * * * * * "+
                "\n* * * * * * * * * * * * *",
            "TRIANGLE",
            JOptionPane.INFORMATION_MESSAGE);
      }
  }