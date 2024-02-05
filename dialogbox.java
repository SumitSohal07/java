import java.util.*;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class dialogbox
{
    public static void main(String[] args)
    {

        float PayRate = 16.5f;
        int HoursWorked;
        int BonusHours;
        float FinalPay;

        String  input = JOptionPane.showInputDialog("Enter the  number of hours you worked for: ");

        HoursWorked = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Bonus hours: ");

        BonusHours = Integer.parseInt(input);

        //calculation

        FinalPay = PayRate*(HoursWorked+BonusHours);

        JOptionPane.showMessageDialog(null,"The finalpay of will is " + FinalPay + "!");
    }
}