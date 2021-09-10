package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scanner = new Scanner(System.in);
        double principal, interestRate, years, timesCompounded, finalValue;

        System.out.println( "What is the principal amount? " );
        principal = scanner.nextFloat();

        System.out.println( "What is the rate? " );
        interestRate = scanner.nextFloat();

        System.out.println( "What is the number of years? " );
        years = scanner.nextFloat();

        System.out.println( "What is the number of times the interest is compounded per year? " );
        timesCompounded = scanner.nextFloat();

        interestRate /= 100;
        finalValue = principal * Math.pow((1 + interestRate/timesCompounded),(timesCompounded*years));
        interestRate *= 100;

        System.out.println( "$" + f.format(principal) + " invested at " + (float)interestRate +
                "% for " + (int)years + " years compounded " + timesCompounded +
                " times per year is $" + f.format(finalValue));
    }
}
