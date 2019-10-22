package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            Scanner keyboard = new Scanner(System.in);
            String myAnswer = keyboard.next();

            System.out.print("Please enter your first initial:");
            String firstInitial = keyboard.next();
            System.out.print("Please enter your last name:");
            String lastName = keyboard.next();
            System.out.print("Please enter your house number:");
            int houseNumber = keyboard.nextInt();
            System.out.print("Please enter your street name:");
            String streetName = keyboard.next();
            System.out.print("Please enter your street type:");
            String streetType = keyboard.next();
            System.out.print("Please enter your city name:");
            String city = keyboard.next();

            System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
            System.out.println(streetName + " " + streetType + " " + city);
        }
    }
}

