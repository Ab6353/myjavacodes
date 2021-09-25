package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;


public class JAVA_income_tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Income tax Calculator");
        System.out.println("Kindly Provide the Annual income in Lakhs :");
        float income = input.nextFloat();
        float tax=0;

        if(income<2.5f){
            tax=tax + 0;
        }
        else if(income>=2.5f && income<=5f){
            tax=  tax + 0.05f*(income-2.5f);
        }
        else if(income>=5f && income<=10f){
            tax=tax + 0.05f*(5-2.5f);
            tax=tax + 0.2f*(income-5f);
        }
        else if(income>=10.0f){
            tax=tax + 0.05f*(5f-2.5f);
            tax=tax + 0.2f*(10.0f-5.0f);
            tax=tax+  0.3f*(income-10.0f);
        }

        System.out.println("Payable Income tax is "+ tax);
    }

}

