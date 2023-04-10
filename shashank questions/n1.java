package main;

import java.util.Arrays;

public class n1 {
    public static void main(String[] args) {

                int[] i = {1, 2, 4,5 };
                int n = i.length; // calculate the size of the array

                // initialize variables
                int x1 = i[0]; //In the example code provided, x1 is a variable that is used to store the XOR result of all the numbers in the given array i[].
                int x2 = 1;     //used to store the XOR result of all the numbers from 1 to n+1, where n is the size of the given array i[].

                // XOR all the numbers in the array and all the numbers from 1 to n+1
                for (int j = 1; j < n; j++) {
                    x1 = x1 ^ i[j];         //"^" is used to perform the XOR operation between two numbers.
                }
                for (int j = 2; j <= n+1; j++) {
                    x2 = x2 ^ j;
                }

                // XOR the results to get the missing number
                int missing_number = x1 ^ x2;

                // print the missing number
                System.out.println("The missing number is: " + missing_number);

    }
}
