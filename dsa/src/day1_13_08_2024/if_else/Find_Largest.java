package dsa.src.day1_13_08_2024.if_else;

import java.util.Scanner;

public class Find_Largest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a :");
        int a = scanner.nextInt();;
        System.out.println("Enter b :");
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("a is largest");
        } else if (a<b) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("a and b are equal");
        }
    }
}
