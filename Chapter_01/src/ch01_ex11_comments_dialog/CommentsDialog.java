/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch01_ex11_comments_dialog;
import javax.swing.*;
/*
Project:  JP9
Module:   Chapter_01
Package:  ch01_ex11_comments_dialog
File:     CommentsDialog
Creator:  Kimberly Henry
Created:  Mon, 01-Feb-2021
*/
public class CommentsDialog
  {
    public static void main(String[] args)
      {
        JOptionPane.showMessageDialog(null, """
                    Program comments are non-executing
                    statements you add to a file for
                    the purpose of documentation.""",
            "COMMENTS", JOptionPane.PLAIN_MESSAGE);
      }
  }
	/*Program comments are non executing statements you add to a file for the purpose of
	documentation.*/

//Program comments are non executing statements you add to a file for the purpose of
//documentation.