package assignment;

public class NumbersDemo {
    public static void main(String[] args){

        int x = 5;
        int y = 10;
        displayTwiceTheNumber(y, x);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);

    }
    public static void displayTwiceTheNumber(int x, int y){
        int x2;
        int y2;

        x2 = x *2;
        y2 = y *2;
        System.out.println(x2 +" " + y2);
    }
    public static void displayNumberPlusFive(int x, int y){
        int x2;
        int y2;

        x2 = x + 5;
        y2 = y + 5;
        System.out.println(x2 +" " + y2);
    }
    public static void displayNumberSquared(int x, int y){
        int x2 = x * x;
        int y2 = (int)Math.pow(y,2);
        System.out.println(x2 +" " + y2);
    }
}
