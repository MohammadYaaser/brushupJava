package com.java.brushup.hackerRank;

import java.io.*;
import java.util.Scanner;

class Result{
    public static void fizzBuzz(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5 == 0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }

        /*
         * Complete the 'decryptPassword' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         <p>Given string <em>s</em>, let <em>s[i]</em> represent the <em>i</em><sup>th</sup>
          character in the string <em>s</em>, using 0-based indexing.</p>
          <ol>
                <li>Initially i = 0.</li>
                <li>If <em>s[i]</em> is lowercase and the next character <em>s[i+1]</em> is uppercase, swap them, add a '*' after them, and move to <em>i+2</em>.</li>
                <li>If <em>s[i]</em> is a number, replace it with <em>0</em>,<em>&nbsp;</em>place the original number at the start, and move to <em>i+1</em>.</li>
                <li>Else, move to <em>i+1</em>.</li>
                <li>Stop if <em>i </em>is more than or equal to the string length. Otherwise, go to step 2.</li>
            </ol>
         */

    }

    public static String decryptPassword(String s) {
        return "";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        Result.fizzBuzz(n);

        // pass word decrypt
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.decryptPassword(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
