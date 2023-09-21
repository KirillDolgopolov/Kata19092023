package org.example;

import java.util.Scanner;

public class Validator {


    public static void validarFecha(String date) {


        String[] parts = date.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2);
        int year = Integer.parseInt(part3);

        boolean bisiesto;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            bisiesto = true;
        } else bisiesto = false;

        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day <= 31 && day >= 1)) {
            System.out.println("The date is correct");
        } else if (((month == 2) && (day <= 28 && day >= 1) && !bisiesto) || ((month == 2) && (day <= 29 && day >= 1) && bisiesto)) {
            System.out.println("The date is correct");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 30 && day >= 1)) {
            System.out.println("The date is correct");
        } else {
            System.out.println("The date is incorrect");
        }


    }

}


