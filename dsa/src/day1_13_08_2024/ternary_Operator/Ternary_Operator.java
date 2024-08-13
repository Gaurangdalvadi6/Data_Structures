package dsa.src.day1_13_08_2024.ternary_Operator;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        String type = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
