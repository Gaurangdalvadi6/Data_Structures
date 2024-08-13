package dsa.src.day1_13_08_2024;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of a and b is : "+sum);
        System.out.println("Sub of a and b is : "+(a-b));
        System.out.println("Multiply of a and b is : "+(a*b));
        System.out.println("Divide of a and b is : "+(a/b));
        System.out.println("Modulo of a and b is : "+(a%b));
    }
}
