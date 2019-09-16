package assignment;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){
        double Height;
        double Width;
        double Length;
        double gallonOfPaint;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Height");
        Height = input.nextDouble();
        System.out.println("Enter the Width");
        Width = input.nextDouble();
        System.out.println("Enter the Length");
        Length = input.nextDouble();
        CalculateArea(Height, Width, Length);
    }
    public static void CalculateArea(double Height, double Width, double Length){

    }
}
