/*
 * Name: Karim Sanieeldin
 * Date: 3/11/16
 * Version: 1.0
 * Description: This program will print out a title table that will display the amount of a yearly 
 * investment over a period of up to 15 years.
 */
package javase.karimsanieeldin;

import java.util.Scanner;

/**
 *
 * @author 1sanieeldkar
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //OBJECT
        Scanner input = new Scanner(System.in);
        
        //EXPLANATION OF PROGRAM OUTPUT
        System.out.println("Compound Investing" + "\n" + "\n" + "This program will print out a title table that will "
                + "display the" + "\n" + "amount of a yearly investment over a period of up to 15 years." + "\n");
        
        //INPUT VARIABLES
        System.out.println("Enter the yearly investment (XY.WZ or XY) :");
        final double INVESTMENT_INPUTED = input.nextDouble();
        System.out.println("Enter the intereast rate (%) :");
        final double INTEREST_INPUTED = input.nextDouble();
        System.out.println("Enter the number of years :");
        final double YEARS_INPUTED = input.nextInt();

        //MATH VARIIABLES
        double investment = INVESTMENT_INPUTED;
        final double INTEREST_RATE = (INTEREST_INPUTED / 100);
        double total = 0;
        double interest = 0;
        
        //YEARS LOWER THAN 16 CHECK
        if (YEARS_INPUTED  <= 15 && YEARS_INPUTED > 0 && INTEREST_INPUTED > 0 && INVESTMENT_INPUTED >= 1) {
            
            //TABLE HEADER
            System.out.format("%-4s | %-18s | %-8s | %-6s \n", "Year", "Amount in Account", "Interest", "Total");
            
            //LOOP CLASSIFICATION
            for (int year = 1 ; year <= YEARS_INPUTED && INVESTMENT_INPUTED >= 1 ; year++) {
                
                //INTEREST CALCULATION
                interest = INTEREST_RATE * investment ;
                
                //TOTAL CALCULATION
                total = investment + interest;
                
                //OUTPUT TABLE
                System.out.format("%-4s | %1s%-17.2f | %-8.2f | %-6.2f \n", year, "$", investment, interest, total);
                
                //UPDATED INVESTMENT CALCULATION
                investment = total + INVESTMENT_INPUTED;
            }
        }
        else {
            System.out.println("ERROR: Please enter an amount of years from 1-15, an investment of at least $1,"
                    + " and an interest rate above 0!");
        }
    }
    
}
