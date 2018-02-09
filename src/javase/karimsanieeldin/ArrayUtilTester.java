/*
 * Name: Karim Sanieeldin
 * Date: 12/12/16
 * Version: 1.0
 * Description: This program tests ArrayUtil.java to see if each method in that 
 * file works properly.
 */
package javase.karimsanieeldin;

/**
 *
 * @author Karim S
 */
public class ArrayUtilTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //MAX USING INTEGERS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest1 = true;
        int[] dataMaxI = ArrayUtil.createArrayI(10, 100, -50);
        int maxI = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Max Using Integers");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays maximum value of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataMaxI);
        // MIN        
        System.out.println("MAXIMUM: ");
        int max1 = ArrayUtil.max(dataMaxI);
        System.out.println(max1);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataMaxI.length; i++) {
            if (maxI <= dataMaxI[i]) {
                maxI = dataMaxI[i];
            }
        }
        assert (maxI == max1) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #1A RESULTS - passed = " + passedTest1);
        
        //MAX USING DOUBLES TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest2 = true;
        double[] dataMaxD = ArrayUtil.createArrayD(10, 100, -50);
        double maxD = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1B      : Max Using Doubles");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays maximum value of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataMaxD);
        // MIN        
        System.out.println("MAXIMUM: ");
        double max2 = ArrayUtil.max(dataMaxD);
        System.out.println(max2);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataMaxD.length; i++) {
            if (maxD <= dataMaxD[i]) {
                maxD = dataMaxD[i];
            }
        }
        assert (maxD == max2) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #1B RESULTS - passed = " + passedTest2);
        
        ///MIN USING INTEGERS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest3 = true;
        int[] dataMinI = ArrayUtil.createArrayI(10, 100, -50);
        int minI = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #2A      : Min Using Integers");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays minimum value of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataMinI);
        // MIN        
        System.out.println("MINIMUM: ");
        int min1 = ArrayUtil.min(dataMinI);
        System.out.println(min1);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataMinI.length; i++) {
            if (minI >= dataMinI[i]) {
                minI = dataMinI[i];
            }
        }
        assert (minI == min1) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #2A RESULTS - passed = " + passedTest3);

        //MIN USING DOUBLES TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest4 = true;
        double[] dataMinD = ArrayUtil.createArrayD(10, 100, -50);
        double minD = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #2B      : Min Using Doubles");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays minimum value of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataMinD);
        // MIN        
        System.out.println("MINIMUM: ");
        double min2 = ArrayUtil.min(dataMinD);
        System.out.println(min2);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataMinD.length; i++) {
            if (minD >= dataMinD[i]) {
                minD = dataMinD[i];
            }
        }
        assert (minD == min2) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #2B RESULTS - passed = " + passedTest4);

        //AVERAGE USING INT TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest5 = true;
        int[] dataAverageI = ArrayUtil.createArrayI(10, 100, -50);
        int averageI = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3A      : Average Using Integers");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays the average of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataAverageI);
        // SUM
        int sumForAverageI = ArrayUtil.sum(dataAverageI);
        // AVERAGE
        System.out.println("AVERAGE: ");
        int average1A = ArrayUtil.average(dataAverageI, sumForAverageI);
        System.out.println(average1A);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataAverageI.length; i++) {
            averageI = averageI + dataAverageI[i];
        }
        assert (averageI / dataAverageI.length == average1A) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #3A RESULTS - passed = " + passedTest5);

        //AVERAGE USING DOUBLES TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest6 = true;
        double[] dataAverageD = ArrayUtil.createArrayD(10, 100, -50);
        double averageD = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3B      : Average Using Doubles");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays the average of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataAverageD);
        // SUM
        double sumForAverageD = ArrayUtil.sum(dataAverageD);
        // AVERAGE
        System.out.println("AVERAGE: ");
        double average2B = ArrayUtil.average(dataAverageD, sumForAverageD);
        System.out.println(average2B);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataAverageD.length; i++) {
            averageD = averageD + dataAverageD[i];
        }
        assert (averageD / dataAverageD.length == average2B) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #3B RESULTS - passed = " + passedTest6);

        //SUM USING INTEGERS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest7 = true;
        int[] dataSumI = ArrayUtil.createArrayI(10, 100, -50);
        int sumI = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4A      : Sum Using Integers");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays the sum of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataSumI);
        // SUM
        System.out.println("SUM: " );
        int sum1 = ArrayUtil.sum(dataSumI);
        System.out.println(sum1);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataSumI.length; i++) {
            sumI = sumI + dataSumI[i];
        }
        assert (sum1 == sumI) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #4A RESULTS - passed = " + passedTest7);

        //SUM USING DOUBLE TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest8 = true;
        double[] dataSumD = ArrayUtil.createArrayD(10, 100, -50);
        double sumD = 0;
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4B      : Sum Using Double");
        System.out.println("PRE CONDITION      : array; + and - numbers");
        System.out.println("POST CONDITION     : displays the sum of the array");
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.displayArray(dataSumD);
        // SUM
        System.out.println("SUM: ");
        double sum2 = ArrayUtil.sum(dataSumD);
        System.out.println(sum2);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataSumD.length; i++) {
            sumD = sumD + dataSumD[i];
        }
        assert (sum2 == sumD) : "Value of data[i] is smaller than data[i+1].";
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #4B RESULTS - passed = " + passedTest8);

        //BUBBLE SORT USING INTEGERS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest9 = true;
        int[] dataBubbleI = ArrayUtil.createArrayI(10, 100, -50);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5A      : Bubble Sort Using Integers");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataBubbleI);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSort(dataBubbleI);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataBubbleI);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataBubbleI.length - 1; i++) {
            assert (dataBubbleI[i] <= dataBubbleI[i + 1]) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #5A RESULTS - passed = " + passedTest9);

        //BUBBLE SORT USING DOUBLES TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest10 = true;
        double[] dataBubbleD = ArrayUtil.createArrayD(10, 100, -50);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5B      : Bubble Sort Using Doubles");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataBubbleD);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSort(dataBubbleD);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataBubbleD);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataBubbleD.length - 1; i++) {
            assert (dataBubbleD[i] <= dataBubbleD[i + 1]) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #5B RESULTS - passed = " + passedTest10);

        //BUBBLE SORT USING STRINGS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest11 = true;
        String[] dataBubbleS = ArrayUtil.createArrayS(10);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5C      : Bubble Sort Using Strings");
        System.out.println("PRE CONDITION      : unsorted array");
        System.out.println("POST CONDITION     : array sorted, alphabetical, descending order");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataBubbleS);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSort(dataBubbleS);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataBubbleS);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataBubbleS.length; i++) {
            assert (dataBubbleS[i].compareTo(dataBubbleS[i++]) <= 0) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #5C RESULTS - passed = " + passedTest11);

        //SELECTION SORT USING INTEGERS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest12 = true;
        int[] dataSelectionI = ArrayUtil.createArrayI(10, 100, -50);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6A      : Selection Sort Using Integers");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataSelectionI);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSort(dataSelectionI);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataSelectionI);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataSelectionI.length - 1; i++) {
            assert (dataSelectionI[i] >= dataSelectionI[i + 1]) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #6A RESULTS - passed = " + passedTest12);

        //SELECTION SORT USING DOUBLES TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest13 = true;
        double[] dataSelectionD = ArrayUtil.createArrayD(10, 100, -50);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6B      : Selection Sort Using Doubles");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataSelectionD);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSort(dataSelectionD);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataSelectionD);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataSelectionD.length - 1; i++) {
            assert (dataSelectionD[i] >= dataSelectionD[i + 1]) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #6B RESULTS - passed = " + passedTest13);

        //SELECTION SORT USING STRINGS TEST
        //BOOLEAN AND ARRAY VARIABLES
        boolean passedTest14 = true;
        String[] dataSelectionS = ArrayUtil.createArrayS(10);
        // HEADER FORMAT
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6C      : Selection Sort Using Strings");
        System.out.println("PRE CONDITION      : unsorted array; ");
        System.out.println("POST CONDITION     : array sorted, alphabetical order");
        // DISPLAY ARRAY BEFORE
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayArray(dataSelectionS);
        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSort(dataSelectionS);
        // DISPLAY ARRAY AFTER
        ArrayUtil.displayArray(dataSelectionS);
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for (int i = 0; i < dataSelectionS.length; i++) {
            assert (dataSelectionS[i].compareTo(dataSelectionS[i++]) <= 0) : "Value of data[i] is smaller than data[i+1].";
        }
        //TEST PASSED OUTPUT
        System.out.println("TEST CASE #6C RESULTS - passed = " + passedTest14);

    }

}
