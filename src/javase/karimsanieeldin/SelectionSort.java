/*
 * Name: Karim Sanieeldin
 * Date: 28/11/16
 * Version: 1.0
 * Description: This program uses the bubble sort method to sort 10 randomly 
 * generated numbers from highest to lowest and displays the number of swaps and
 * comparisons that were made.
 */
package javase.karimsanieeldin;

/**
 *
 * @author 1sanieeldkar
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    //MAIN METHOD
    public static void main(String[] args) {

        //explanation of program output
        System.out.println("Selection Sort\n\nThis program uses the selection sort method to sort"
                + " 10 randomly \ngenerated numbers from highest to lowest and displays "
                + "the number \nof swaps and comparisons that were made.\n");

        //variable stores array generated
        int[] data = createArray();

        //displays unsorted array after each sort
        System.out.println("Unsorted:");
        displayArray(data);

        //calls bubble sort method (sorts array)
        selectionSort(data);

        //displays sorted array
        System.out.println("\nSorted:");
        displayArray(data);
    }

    //METHOD FOR GENERATING RANDOM ARRAY OF INTEGERS
    public static int[] createArray() {

        //array variable
        int[] data = new int[10];
        //loop creates numbers in array since it loops as long as data's length
        for (int i = 0; i < data.length; i++) {
            //generates a random number between 1 and 1000
            data[i] = (int) (Math.random() * 1000) + 1;
        }
        return data;
    }

    //METHOD MAKES LOWEST NUMBERS IN ARRAY FARTHEST TO THE RIGHT (SELECTION SORT)
    public static void selectionSort(int[] data) {
        //variables
        int pass = 0, c, first, v, nSwaps = 0, nComparisons = 0;
        //loop passes on to the next number in array to sort
        for (pass = data.length - 1; pass > 0; pass--) {

            //initialize to subscript of first element
            first = 0;
            //locate smallest element between positions 1 and pass.
            for (c = 1; c <= pass; c++) {
                if (data[c] < data[first]) {
                    first = c;
                    //increases number of swaps by 1
                    nSwaps++;
                }
                //swap smallest found with number in position pass.
                v = data[first];
                data[first] = data[pass];
                data[pass] = v;
                //increases number of comparisons by 1
                nComparisons++;
            }
            //calls display array method to display the array after each sort
            displayArrayI(data);
        }
        //prints out the number of swaps and comparisons at the end of the method
        System.out.println("\nNumber of swaps: " + nSwaps + "\nNumber of comparisons: " + nComparisons);
    }

    //METHOD FORMATS ARRAY
    public static void displayArray(int[] data) {

        //loop prints array
        for (int i = 0; i < data.length; i++) {
            //prints out the number in the array at i
            System.out.print(data[i] + " ");
        }
        //separates arrays printed from each other
        System.out.println("");
    }

    //METHOD FORMATS ARRAY
    public static void displayArrayI(int[] data) {

        //loop prints array
        for (int i = 0; i < data.length; i++) {
            //prints out the number in the array at i
            System.out.print(data[i] + " ");
        }
        //separates arrays printed from each other
        System.out.println("");
    }

}
