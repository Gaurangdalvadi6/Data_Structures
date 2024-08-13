package dsa.src.day1_13_08_2024.if_else;

import java.util.Scanner;

public class Find_Even_Or_Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
