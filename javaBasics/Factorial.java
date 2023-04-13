package javaBasics;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Example input
        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
