package com.company;

/*
Prompt the user to enter a number. After the user enters a number, add 1 to the number and output it back to the console
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner scnr = new Scanner(System.in);
	int input = scnr.nextInt();
	int output = input + 1;
	System.out.println(output);
    }

}
