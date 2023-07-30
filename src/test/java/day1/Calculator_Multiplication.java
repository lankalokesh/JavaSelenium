package day1;

public class Calculator_Multiplication {

    public void multiNumber(int x, int y) {
        int multi = x * y;
        System.out.println("Multiplication of two numbers: " + multi);

    }

    public static void main(String[] args) {
        new Calculator_Multiplication();
        Calculator_Multiplication cal = new Calculator_Multiplication();

        cal.multiNumber(20, 40);
        cal.multiNumber(44, 67);
    }
}