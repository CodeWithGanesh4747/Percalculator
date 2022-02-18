package com.company;

import java.util.Scanner;

public class CHW_11_PerCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the S1 Marks :");
        int s1=  input.nextInt();


        System.out.println("Enter the s2 marks : ");
        int s2 = input.nextInt();

        System.out.println("Enter the s3 marks  :");
        int s3 = input.nextInt();


        System.out.println("Enter the s4 marks :");
        int s4 = input.nextInt();

        System.out.println("Enter the s5 marks  :");
        int s5 = input.nextInt();

        float Percentage= ((s1+s2+s3+s4+s5)/500.0f)*100;


        System.out.println("Percentage :");
        System.out.println(Percentage);

    }
}
