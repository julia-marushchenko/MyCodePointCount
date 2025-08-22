// Java program to use codePointCount(int beginIndex, int endIndex1) method to represent number of unicode points

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string to use with method codePointCount(int index, int index1)
        String str = "I am String";

        // Counting last character index
        int endIndex = str.length();

        // Int result
        int result = str.codePointCount(0, endIndex);

        // Printing result to console
        System.out.println(result);
    }
}