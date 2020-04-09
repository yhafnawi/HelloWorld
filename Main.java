package com.company;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float anualIntrest = scanner.nextFloat();
        float monthlyInterest = anualIntrest / 100.0F / 12.0F;
        System.out.print("Period Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * 12;
        double mortage = (double)principal * (double)monthlyInterest * Math.pow((double)(1.0F + monthlyInterest), (double)numberOfPayments) / Math.pow(13.0D, (double)numberOfPayments);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortageFormatted);
    }
}