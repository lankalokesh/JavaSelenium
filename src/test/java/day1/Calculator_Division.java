package day1;

public class Calculator_Division {
    public void divNumber(int x, int y) {
        int div = x / y;
        System.out.println("Division of two numbers: " + div);
    }

    public static void main(String[] args) {
        new Calculator_Division();
        Calculator_Division cal = new Calculator_Division();

        cal.divNumber(20, 40);
        cal.divNumber(44, 67);
    }
}