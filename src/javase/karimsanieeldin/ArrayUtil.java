/*
 * Name: Karim Sanieeldin
 * Date: 12/12/16
 * Version: 1.0
 * Description: This program contains multiple methods that can be used to reduce
 * the amount of code in future programs.
 */
package javase.karimsanieeldin;

/**
 *
 * @author 1sanieeldkar
 */
public class ArrayUtil {

    /**
     * @param args the command line arguments
     */
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

    public static void displayArray(double[] data) {
        //loop prints array
        for (int i = 0; i < data.length; i++) {
            //prints out the number in the array at i
            System.out.print(data[i] + " ");
        }
        //separates arrays printed from each other
        System.out.println("");
    }

    public static void displayArray(String[] data) {
        //loop prints array
        for (int i = 0; i < data.length; i++) {
            //prints out the number in the array at i
            System.out.print(data[i] + " ");
        }
        //separates arrays printed from each other
        System.out.println("");
    }

    //METHOD FOR GENERATING RANDOM ARRAY OF INTEGERS
    public static int[] createArrayI(int size, int range, int startValue) {
        //array variable
        int[] data = new int[size];
        //loop creates numbers in array since it loops as long as the array's length
        for (int i = 0; i < data.length; i++) {
            //generates a random number from the range given
            data[i] = (int) (Math.random() * range) + startValue;
        }
        return data;
    }

    //METHOD FOR GENERATING RANDOM ARRAY OF DOUBLES
    public static double[] createArrayD(int size, int range, int startValue) {
        //array variable
        double[] data = new double[size];
        //loop creates numbers in array since it loops as long as the array's length
        for (int i = 0; i < data.length; i++) {
            //generates a random number between 1 and 1000
            data[i] = (double) (Math.random() * range) + startValue;
        }
        return data;
    }

    //METHOD FOR GENERATING RANDOM ARRAY OF STRINGS
    public static String[] createArrayS(int size) {
        //array variable
        String[] data = new String[size];
        //loop creates numbers in array since it loops as long as the array's length
        for (int i = 0; i < data.length; i++) {
            //generates a random number between 1 and 1000 and assignes it to a letter
            for (int j = 0; j < size; j++) {
                data[j] = "" + (char) ((int) (Math.random() * 26) + 65);
            }
        }
        return data;
    }

    //METHOD MAKES LOWEST INTEGERS IN ARRAY FARTHEST TO THE RIGHT (BUBBLE SORT)
    public static void bubbleSort(int data[]) {
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
                }
            }
        }
    }

    //METHOD MAKES LOWEST INTEGERS IN ARRAY FARTHEST TO THE RIGHT (SELECTION SORT)
    public static void selectionSort(int[] data) {
        //variables
        int pass, c, first, v;
        //loop passes on to the next number in array to sort
        for (pass = data.length - 1; pass > 0; pass--) {
            //initialize to subscript of first element
            first = 0;
            //locate smallest element between positions 1 and pass.
            for (c = 1; c <= pass; c++) {
                if (data[c] < data[first]) {
                    first = c;
                }
                //swap smallest found with number in position pass.
                v = data[first];
                data[first] = data[pass];
                data[pass] = v;
            }
        }
    }

    //METHOD MAKES LOWEST DOUBLE IN ARRAY FARTHEST TO THE RIGHT (BUBBLE SORT)
    public static void bubbleSort(double data[]) {
        //variables
        double v;
        //loop passes on to the next number in array to sort
        for (int pass = 0; pass < data.length; pass++) {
            for (int c = 0; c < data.length - 1; c++) {
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
                }
            }
        }
    }

    //METHOD MAKES LOWEST NUMBERS IN ARRAY FARTHEST TO THE RIGHT (SELECTION SORT)
    public static void selectionSort(double[] data) {
        //variables
        double v;
        int first;
        //loop passes on to the next number in array to sort
        for (int pass = data.length - 1; pass > 0; pass--) {
            //initialize to subscript of first element
            first = 0;
            //locate smallest element between positions 1 and pass.
            for (int c = 1; c <= pass; c++) {
                if (data[c] < data[first]) {
                    first = c;
                }
                //swap smallest found with number in position pass.
                v = data[first];
                data[first] = data[pass];
                data[pass] = v;
            }
        }
    }

    //METHOD ALPHABETICALLY SORTS WITH DESCENDING ORDER (SELECTION SORT)
    public static void bubbleSort(String[] data) {
        //variables
        int j;
        boolean flag = true;  // will determine when the sort is finished
        String temp;

        while (flag) {
            flag = false;
            for (j = 0; j < data.length - 1; j++) {
                if (data[j].compareToIgnoreCase(data[j + 1]) < 0) {// ascending sort
                    temp = data[j];
                    data[j] = data[j + 1];     // swapping
                    data[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    //METHOD ALPHABETICALLY SORTS WITH ASCENDING ORDER (SELECTION SORT)
    public static void selectionSort(String[] data) {
        //variables
        int pass, c, first;
        String v;
        //loop passes on to the next number in array to sort
        for (pass = data.length - 1; pass > 0; pass--) { 
            //initialize to subscript of first element
            first = 0;
            //locate smallest element between positions 1 and pass.
            for (c = 1; c <= pass; c++) {
                if (data[c].compareTo(data[first]) >= 0) {
                    first = c;
                }
                //swap smallest found with number in position pass.
                v = data[first];
                data[first] = data[pass];
                data[pass] = v;
            }
        }
    }

    public static int linearSearch(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static double linearSearch(double[] data, double key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void linearSearch(String[] data, String key) {
        int i, flag = 0;
        for (i = 0; i < 10; i++) {
            if (key.equals(data[i])) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The word was located at the " + (i + 1) + " position.");
        } else {
            System.out.println("The word was not found.");
        }
    }

    public static int binarySearch(int[] data, int key) {
        //variables
        int left = 0;
        int right = data.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (key < data[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        return -1;
    }

    public static int binarySearch(double[] data, int key) {
        //variables
        int left = 0;
        int right = data.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (key < data[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void binarySearch(String[] data, String key) {
        //variables
        int left = 0, right = data.length - 1, mid = 0;
        char characterKey = key.charAt(0);
        int asciiKey = (int) characterKey;
        char characterMid;
        int asciiMid;

        while (left <= right) {
            mid = (left + right) / 2;
            characterMid = data[mid].charAt(0);
            asciiMid = (int) characterMid;
            if (data[mid].equals(key)) {
                System.out.println("The string was located at " + mid + ".");
            } else if (asciiKey < asciiMid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }

    public static int max(int[] data) {
        int max = Integer.MIN_VALUE;
        for (int d : data) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static double max(double[] data) {
        double max = Double.MIN_VALUE;
        for (double d : data) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static int min(int[] data) {
        int min = Integer.MAX_VALUE;
        for (int d : data) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public static double min(double[] data) {
        double min = Double.MAX_VALUE;
        for (double d : data) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public static int average(int[] data, int sum) {
        int average = sum / data.length;
        return average;
    }

    public static double average(double[] data, double sum) {
        double average = sum / data.length;
        return average;
    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = data[i] + sum;
        }
        return sum;
    }

    public static double sum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = data[i] + sum;
        }
        return sum;
    }

}
