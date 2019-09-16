package assignment;

import java.util.Scanner;

public class FahrenheitConvertion {
    public static void main(String[] args){

        double temp;
        Scanner input = new Scanner(System.in);
        System.out.println("what is your temp in celsius at 8:00");
        temp = input.nextDouble();
        convert(temp);
        System.out.println("what is your temp in celsius at 12:00");
        temp = input.nextDouble();
        convert(temp);
        System.out.println("what is your temp in celsius at 5:00");
        temp = input.nextDouble();
        convert(temp);
    }
    public static void convert(double temp){
        double convertF;
        convertF = (temp * 9/5) + 32;
        System.out.println("What is the number converted into Fahrenheit " +convertF);
    }
}
