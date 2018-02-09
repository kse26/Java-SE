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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    //MAIN METHOD
    public static void main(String[] args) {

        //explanation of program output
        System.out.println("BubbleSort\n\nThis program uses the bubble sort method to sort"
                + " 10 randomly \ngenerated numbers from highest to lowest and displays "
                + "the number \nof swaps and comparisons that were made.\n");
                
        //variable stores array generated
        int[] data = createArray();

        //displays unsorted array after each sort
        System.out.println("Unsorted:");
        displayArray(data);

        //calls bubble sort method (sorts array)
        bubbleSort(data);

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

    //METHOD MAKES LOWEST NUMBERS IN ARRAY FARTHEST TO THE RIGHT (BUBBLE SORT)
    public static void bubbleSort(int data[]) {

        //variables for swaps and comparisons
        int nSwaps = 0;
        int nComparisons = 0;
        //loop passes on to the next number in array to sort
        for (int pass = 0; pass < data.length; pass++) {
            
            for (int c = 0, v; c < data.length - 1; c++) {
                //checks if number is bigger than the number next to it
                if (data[c] > data[c + 1]) {
                    //these next three calcs basically swap data[c] with the 
                    //number next to it
                    //sets v to equal number at data[c]
                    v = data[c];
                    //sets data[c] to equal the number next to it
                    data[c] = data[c + 1];
                    //sets the number next to data[c] to equal v 
                    data[c + 1] = v;
                    //increases number of swaps by one
                    nSwaps++;
                }
                //increases number of comparisons by one
                nComparisons++;

            }
            //calls display array method to display the array after each sort
            displayArray(data);
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
}