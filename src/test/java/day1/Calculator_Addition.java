package day1;

public class Calculator_Addition {

    public void addNumber(int x, int y){
        int sum =x+y;
        System.out.println("Addition of two numbers: " + sum);

    }

    //Method overloading
    public void addNumber(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Addition of two numbers: " + sum);
    }
    public static void main(String[] args) {
        new Calculator_Addition();
        Calculator_Addition cal = new Calculator_Addition();

      cal.addNumber(20, 40);
      cal.addNumber(44, 67);
      cal.addNumber(44, 45, 45);

    }
}
