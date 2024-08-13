package dsa.src.day1_13_08_2024.ternary_Operator;

import java.util.Scanner;

public class Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = scanner.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
