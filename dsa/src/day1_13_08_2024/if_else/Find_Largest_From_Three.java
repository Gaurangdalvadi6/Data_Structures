package dsa.src.day1_13_08_2024.if_else;

import java.util.Scanner;

public class Find_Largest_From_Three {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println("a is largest");
        } else if (b>c) {
            System.out.println("b is largest");
        }else {
            System.out.println("c is largest");
        }
    }
}
