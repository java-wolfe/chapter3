package examples;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int useEntry1;
        int useEntry2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >>> ");
        useEntry1 = input.nextInt();
        System.out.println("Enter a number >>> ");
        useEntry2 = input.nextInt();
        calculateAddition(useEntry1, useEntry2);
        calculateSubtraction(useEntry1, useEntry2);
        calculateMultiplication(useEntry1, useEntry2);
        calculateDivision(useEntry1, useEntry2);
        calculateModules(useEntry1, useEntry2);
    }
    public static void calculateAddition(int num1, int num2){
        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
    }
    public static void calculateSubtraction(int num1, int num2){
        int total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);
    }
    public static void calculateMultiplication(int num1, int num2){
        int total = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + total);
    }
    public static void calculateDivision(int num1, int num2){
        int total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
    }
    public static void calculateModules(int num1, int num2){
        int total = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = "+ total);
    }


}
