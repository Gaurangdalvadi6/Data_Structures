package dsa.src.day1_13_08_2024;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.print("1 2 3 4 5\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input:");
        int a = sc.nextInt();

        for (int i = a; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name is : "+name);
    }
}

