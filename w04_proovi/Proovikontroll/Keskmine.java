package Proovikontroll;

public class Keskmine {
    public static void main(String[] args) {
        System.out.format("The average is: %.3f", avg(3, 10, 9000000));
    }

    public static double avg(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
