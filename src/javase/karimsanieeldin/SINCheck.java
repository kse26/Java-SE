/*
 * Name: Karim Sanieeldin
 * Date: 28/11/16
 * Version: 1.0
 * Description: This program asks the user to enter a SIN and determines if that SIN
 * is correct.
 */
package javase.karimsanieeldin;

import java.util.Scanner;

/**
 *
 * @author 1sanieeldkar
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //OBJECT
        Scanner input = new Scanner(System.in);

        //EXPLANATION OF PROGRAM OUTPUT
        System.out.println("Social Insurance Number" + "\n" + "\n" + "In Canada, each person is uniquely identified by the "
                + "the Government with a Social" + "\n" + "Insurance Number (SIN). A Social Insurance Number consists of nine digits. "
                + "The" + "\n" +"first eight numbers are assigned digits and the last number is a digit check." + "\n" +"This program determines "
                + "if the check digit for a SIN is correct." + "\n");
        
        //VARIABLES
        String SINEntered = "0";
        int evenSplit1 = 0;
        int evenSplit2 = 0;
        int evenSplit3 = 0;
        int evenSplit4 = 0;
        int highestTenMult = 0;
        int total;
        int even1;
        int even2;
        int even3;
        int even4;
        int even;
        int odd;

        //SIN NUMBER EQUALS NINE DIGITS CHECK
        while (SINEntered.length() != 9) {
            System.out.println("Enter Social Insurance Number: ");
            SINEntered = input.nextLine();
        }

        //EVEN NUMBERS IN SIN NUMBER ENTERED
        final int firstEven = java.lang.Character.getNumericValue(SINEntered.charAt(1)),
                secondEven = java.lang.Character.getNumericValue(SINEntered.charAt(3)),
                thirdEven = java.lang.Character.getNumericValue(SINEntered.charAt(5)),
                fourthEven = java.lang.Character.getNumericValue(SINEntered.charAt(7));

        //ODD NUMBERS IN SIN NUMBER ENTERED
        final int firstOdd = java.lang.Character.getNumericValue(SINEntered.charAt(0)),
                secondOdd = java.lang.Character.getNumericValue(SINEntered.charAt(2)),
                thirdOdd = java.lang.Character.getNumericValue(SINEntered.charAt(4)),
                fourthOdd = java.lang.Character.getNumericValue(SINEntered.charAt(6)),
                fifthOdd = java.lang.Character.getNumericValue(SINEntered.charAt(8));

        //EVEN NUMBERS CALCULATIONS
        even1 = (firstEven * 2);
        even2 = (secondEven * 2);
        even3 = (thirdEven * 2);
        even4 = (fourthEven * 2);

        //IF STATEMENT TO CHECK FOR EVEN NUMBERS BIGGER THAN 9
        if (even1 > 9 || even2 > 9 || even3 > 9 || even4 > 9) {

            //THE SWITCHES SPLIT THE EVEN NUMBERS BIGGER THAN 9 WHEN DOUBLED
            switch (even1) {
                case 10:
                    even1 = 1;
                    evenSplit1 = 0;
                    break;
                case 11:
                    even1 = 1;
                    evenSplit1 = 1;
                    break;
                case 12:
                    even1 = 1;
                    evenSplit1 = 2;
                    break;
                case 13:
                    even1 = 1;
                    evenSplit1 = 3;
                    break;
                case 14:
                    even1 = 1;
                    evenSplit1 = 4;
                    break;
                case 15:
                    even1 = 1;
                    evenSplit1 = 5;
                    break;
                case 16:
                    even1 = 1;
                    evenSplit1 = 6;
                    break;
                case 17:
                    even1 = 1;
                    evenSplit1 = 7;
                    break;
                case 18:
                    even1 = 1;
                    evenSplit1 = 8;
                    break;
            }

            switch (even2) {
                case 10:
                    even2 = 1;
                    evenSplit2 = 0;
                    break;
                case 11:
                    even2 = 1;
                    evenSplit2 = 1;
                    break;
                case 12:
                    even2 = 1;
                    evenSplit2 = 2;
                    break;
                case 13:
                    even2 = 1;
                    evenSplit2 = 3;
                    break;
                case 14:
                    even2 = 1;
                    evenSplit2 = 4;
                    break;
                case 15:
                    even2 = 1;
                    evenSplit2 = 5;
                    break;
                case 16:
                    even2 = 1;
                    evenSplit2 = 6;
                    break;
                case 17:
                    even2 = 1;
                    evenSplit2 = 7;
                    break;
                case 18:
                    even2 = 1;
                    evenSplit2 = 8;
                    break;
            }

            switch (even3) {
                case 10:
                    even3 = 1;
                    evenSplit3 = 0;
                    break;
                case 11:
                    even3 = 1;
                    evenSplit3 = 1;
                    break;
                case 12:
                    even3 = 1;
                    evenSplit3 = 2;
                    break;
                case 13:
                    even3 = 1;
                    evenSplit3 = 3;
                    break;
                case 14:
                    even3 = 1;
                    evenSplit3 = 4;
                    break;
                case 15:
                    even3 = 1;
                    evenSplit3 = 5;
                    break;
                case 16:
                    even3 = 1;
                    evenSplit3 = 6;
                    break;
                case 17:
                    even3 = 1;
                    evenSplit3 = 7;
                    break;
                case 18:
                    even3 = 1;
                    evenSplit3 = 8;
                    break;
            }

            switch (even4) {
                case 10:
                    even4 = 1;
                    evenSplit4 = 0;
                    break;
                case 11:
                    even4 = 1;
                    evenSplit4 = 1;
                    break;
                case 12:
                    even4 = 1;
                    evenSplit4 = 2;
                    break;
                case 13:
                    even4 = 1;
                    evenSplit4 = 3;
                    break;
                case 14:
                    even4 = 1;
                    evenSplit4 = 4;
                    break;
                case 15:
                    even4 = 1;
                    evenSplit4 = 5;
                    break;
                case 16:
                    even4 = 1;
                    evenSplit4 = 6;
                    break;
                case 17:
                    even4 = 1;
                    evenSplit4 = 7;
                    break;
                case 18:
                    even4 = 1;
                    evenSplit4 = 8;
                    break;
            }
        }
        
        //TOTAL VALUE OF EVEN NUMBERS
        even = even1 + evenSplit1 + even2 + evenSplit2 + even3 + evenSplit3 + even4 + evenSplit4;

        //ODD NUMBERS CALCULATIONS
        odd = firstOdd + secondOdd + thirdOdd + fourthOdd;

        //TOTAL VALUE OF ODD AND EVEN NUMBERS
        total = odd + even;

        //IF STATEMENT FINDS THE HIGHEST MULTIPLE OF THE TOTAL VALUE
        if (total > 0 && total < 10) {
            highestTenMult = 10;
        } else if (total > 9 && total < 20) {
            highestTenMult = 20;
        } else if (total > 19 && total < 30) {
            highestTenMult = 30;
        } else if (total > 29 && total < 40) {
            highestTenMult = 40;
        } else if (total > 39 && total < 50) {
            highestTenMult = 50;
        } else if (total > 49 && total < 60) {
            highestTenMult = 60;
        } else if (total > 59 && total < 70) {
            highestTenMult = 70;
        } else if (total > 69 && total < 80) {
            highestTenMult = 80;
        } else if (total > 79 && total < 90) {
            highestTenMult = 90;
        } else {
            System.out.println("The Check Digit of the SIN is incorrect!");
        }
        
        //LAST DIGIT CHECK
        total = highestTenMult - total;
        if (fifthOdd == total) {
            System.out.println("The Check Digit of the SIN is correct.");
        } else {
            System.out.println("The Check Digit of the SIN is incorrect!");
        }
    }
}
