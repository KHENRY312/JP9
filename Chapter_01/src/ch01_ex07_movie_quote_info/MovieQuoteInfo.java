/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch01_ex07_movie_quote_info;
import javax.swing.*;
/*
Project:  JP9
Module:   Chapter_01
Package:  ch01_ex07_movie_quote_info
File:     MovieQuoteInfo
Creator:  Kimberly Henry
Created:  Mon, 01-Feb-2021
*/
public class MovieQuoteInfo
  {
    public static void main(String[] arg)
      {
        JOptionPane.showMessageDialog (null, """
                    Gone with the Wind\s
                    Year:  1939
                    Frankly my dear, I do not give a damn
                    Rhett Butler""",
            "FAVORITE MOVIE QUOTE INFO",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
      }
  }