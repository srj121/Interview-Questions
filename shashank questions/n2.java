package main;

public class n2 {

    public static void main(String[] args) {
                int[] i = {1, 2, 3, 5};
                int n = i.length; // calculate the size of the array

                // initialize variables
                int sum = 0;
                int expected_sum = (n + 1) * (n + 2) / 2;

                // calculate the sum of the given array
                for (int j = 0; j < n; j++) {
                    sum += i[j];
                }

                // calculate the expected sum and subtract the actual sum
                int missing_number = expected_sum - sum;

                // print the missing number
                System.out.println("The missing number is: " + missing_number);
            }
        }
