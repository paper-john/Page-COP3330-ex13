package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest
{
    public static void main( String[] args )
    {
        //define variable
        int principle, compound, years;
        double rate, total;

        Scanner input = new Scanner(System.in);

        //Get input for Principle, rate, years, and number of times compounded
        System.out.print("What is the principle amount? ");
        principle = input.nextInt();

        System.out.print("What is the rate? ");
        rate = input.nextDouble();

        System.out.print("What is the number of years? ");
        years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = input.nextInt();

        //Calculate total
        total = principle * Math.pow((1 + (rate / 100) / compound), compound * years);

        //Display result
        System.out.printf("$%d invested at %.1f%% for %d year compounded %d times per year is $%.2f.\n", principle, rate, years, compound, total);
    }
}
