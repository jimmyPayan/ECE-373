/**
 * Assignment 1 for ECE 373.
 * Jimmy Payan
 * September 7, 2024
 */
// class utilizations
import javax.swing.JOptionPane;
import java.util.Scanner;

public class OrderForm
{
    public static void main(String[] args)
    {
    // initialise instance variables
    int Outlet_120V_5A_Quantity = 0;
    int Outlet_1Phase_20A_Quantity = 0;
    int Outlet_3Phase_20A_Quantity = 0;
    
    double Outlet_120V_5A_Price = 144.82;
    double Outlet_1Phase_20A_Price = 392.26;
    double Outlet_3Phase_20A_Price = 525.83;
    
    double item1_Cost = 0;
    double item2_Cost = 0;
    double item3_Cost = 0;
    
    double tax_Rate = 0.086;
    double pretax_Cost = 0;
    double tax_Cost = 0;
    double posttax_Cost = 0;
    
    Scanner temp = new Scanner(System.in);
    String customer;
    
    JOptionPane.showMessageDialog
    (null, "Welcome to Medtrade West Purchase Order. \nEnter customer name in Command Prompt.");
    System.out.printf("Enter customer name:");
    customer = temp.nextLine();
    
    // Dialog Boxes
    Outlet_120V_5A_Quantity = Integer.parseInt(JOptionPane.showInputDialog(
    "Enter quantity of 120V Motor & Equipment Outlet(s), 5A for " + Outlet_120V_5A_Price + " each:"));
    Outlet_1Phase_20A_Quantity = Integer.parseInt(JOptionPane.showInputDialog(
    "Enter quantity of 1 Phase 208VAC 60 Cycle Outlet(s), 20A, for $" + Outlet_1Phase_20A_Price + " each:"));
    Outlet_3Phase_20A_Quantity = Integer.parseInt(JOptionPane.showInputDialog(
    "Enter quantity of 3 Phase 208VAC 60 Cycle Outlet(s), 20A, for $" + Outlet_3Phase_20A_Price + " each:"));
    
    item1_Cost = Outlet_120V_5A_Price * Outlet_120V_5A_Quantity;
    item2_Cost = Outlet_1Phase_20A_Price * Outlet_1Phase_20A_Quantity;
    item3_Cost = Outlet_3Phase_20A_Price * Outlet_3Phase_20A_Quantity;
    
    pretax_Cost = item1_Cost + item2_Cost + item3_Cost;
    tax_Cost = pretax_Cost * tax_Rate;
    posttax_Cost = pretax_Cost + tax_Cost;
    
    System.out.printf(    
    "Pretax cost is $%.2f.\nTax is %.2f.\n%s, your total is $%.2f.\nThe digit that corresponds to the hundreds digit is %.0f",
    pretax_Cost, tax_Cost, customer, posttax_Cost, 
    ((posttax_Cost % 1000) - (posttax_Cost % 100)) / 100
    );
    
    JOptionPane.showMessageDialog(null, 
    "Pretax cost is $" + String.format("%.2f", pretax_Cost) + 
    ".\nTax is $" + String.format("%.2f", tax_Cost) + 
    ".\n" + customer + 
    ", your total is $" + String.format("%.2f", posttax_Cost) + 
    ".\nThe digit that corresponds to the hundreds digit is " + 
    String.format("%.0f" , ((posttax_Cost % 1000) - (posttax_Cost % 100)) / 100) );
    }
}
