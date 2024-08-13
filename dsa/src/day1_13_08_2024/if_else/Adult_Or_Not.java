package dsa.src.day1_13_08_2024.if_else;

import java.util.Scanner;

public class Adult_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        
        if (age>=18){
            System.out.println("It is adult");
        } else if (age>=13) {
            System.out.println("It is Teenager");
        }else {
            System.out.println("It is child");
        }
    }
}
