package dsa.src.day1_13_08_2024.ternary_Operator;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = scanner.nextInt();
        String check = (a >= 0) ? "Positive" : "Negative";
        System.out.println(check);
    }
}
