/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner items = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        int item1 = items.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int item1qty = items.nextInt();

        System.out.print("Enter the price of item 2: ");
        int item2 = items.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int item2qty = items.nextInt();

        System.out.print("Enter the price of item 3: ");
        int item3 = items.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int item3qty = items.nextInt();

        double subtotal = (item1 * item1qty) + (item2 * item2qty) + (item3 * item3qty);
        System.out.printf("Subtotal: $%.2f\n",subtotal);

        double tax = subtotal * 0.055;
        System.out.println("Tax: $" + tax);

        double total = subtotal + tax;
        System.out.println("Subtotal: $" + total);


    }
}
