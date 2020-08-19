package com.company;

import com.sun.source.tree.CatchTree;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte Months = 12;
	final byte percent = 100;


	int Principal=0;
	double monthlyrate=0;
	double duration=0;

        Scanner value = new Scanner(System.in);
        while (true) {
            System.out.println("Principal= ");
            Principal = value.nextInt();
            if (Principal >= 1000 && Principal <= 1_000_000)
                break;
            System.out.println("Enter Values between 1000 and 1M");
        }

        while (true) {
            System.out.println("Interest Rate= ");
            double rate = value.nextDouble();
            if (rate >= 1 && rate <= 30) {
                monthlyrate = rate / Months / percent;
                break;
            }
            System.out.println("Enter values between 1 and 30");
        }


        while (true) {
            System.out.println("Loan Duration(years)= ");
            double period = value.nextDouble();
            if (period >= 1 && period <= 30) {
                duration = period * Months;
                break;
            }
        }
        double Mortgage = Principal
                *(monthlyrate * Math.pow(1 + monthlyrate, duration))
                / (Math.pow(1+monthlyrate,duration)-1);



        System.out.println("Mortgage= " + NumberFormat.getCurrencyInstance().format(Mortgage));

    }


}