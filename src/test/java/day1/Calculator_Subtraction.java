package day1;

public class Calculator_Subtraction {

    public void subtractNumber(int x, int y) {
        int subtract = x - y;
        System.out.println("Subtraction of two numbers: " + subtract);
    }

    public static void main(String[] args) {
        new Calculator_Subtraction();
        Calculator_Subtraction cal = new Calculator_Subtraction();

        cal.subtractNumber(20, 40);
        cal.subtractNumber(44, 67);
    }
}
