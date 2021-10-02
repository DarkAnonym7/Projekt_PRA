package spsmb.com.projekt;

import java.util.Scanner;

public class Project_Oct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CrispsPr = 23;
        int BreadPr = 40;
        int MilkPr = 15;

        double CrispsTax = CrispsPr * 1.15 - CrispsPr;
        double BreadTax = BreadPr * 1.15 - BreadPr;
        double MilkTax = MilkPr * 1.15 - MilkPr;

        double CrispsT = CrispsPr * 0.85;
        double BreadT = BreadPr * 0.85;
        double MilkT = MilkPr * 0.85;

        System.out.println("Crisps 23CZK");
        System.out.println("Bread 40CZK");
        System.out.println("Milk(1l) 15CZK");

        System.out.println("How many bags of crisps do you want?");
        int CrispsNum = Integer.parseInt(sc.nextLine());
        System.out.println("How many loaves of bread do you want?");
        int BreadNum = Integer.parseInt(sc.nextLine());
        System.out.println("How many liters of milk do you want?");
        int MilkNum = Integer.parseInt(sc.nextLine());

        int TotalCrisps = CrispsPr * CrispsNum;
        int TotalBread = BreadPr * BreadNum;
        int TotalMilk = MilkPr * MilkNum;

        int TotalPr = TotalCrisps + TotalBread + TotalMilk;

        System.out.println();
        System.out.println("|item|" + " |unit price| " + "|Tax|" + " |price|" + " |how many| " + "|cost|");
        System.out.println();
        System.out.println("Crisps  " + CrispsT + "       " + Math.round(CrispsTax * 100) / 100.0d + " " + " 23CZK " + "       " + CrispsNum + "       " + TotalCrisps + "CZK");
        System.out.println("Bread   " + BreadT + "        " + Math.round(BreadTax * 100) / 100.0d + " " + "  40CZK " + "       " + BreadNum + "       " + TotalBread + "CZK");
        System.out.println("Milk    " + MilkT + "       " + Math.round(MilkTax * 100) / 100.0d + " " + " 15CZK " + "       " + MilkNum + "       " + TotalMilk + "CZK");
        System.out.println("------------------------------------------------------------");
        System.out.println("Total price:                                  " + TotalPr + "Kc");

    }
}
