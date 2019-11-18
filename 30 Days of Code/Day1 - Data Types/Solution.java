import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int myInt;
        double myDouble;
        String myString;

        /* Read and save an integer, double, and String to your variables.*/
        myInt = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        myDouble = Math.round(scan.nextDouble() * 10) / 10.0;
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        myString = scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + myInt);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + myDouble);
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(s + myString);
        scan.close();
    }
}