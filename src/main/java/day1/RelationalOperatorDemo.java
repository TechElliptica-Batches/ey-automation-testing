package day1;


import java.util.Scanner;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
        // > >= < <= == and != // boolean value
        Scanner scan = new Scanner(System.in);
        System.out.println("number a : ");
        int a = scan.nextInt();
        System.out.println("number b : ");
        int b = scan.nextInt();

        System.out.println("a > b = " + (a > b)); // false
        System.out.println("a >= b = " + (a >= b)); // false
        System.out.println("a < b = " + (a < b)); // true
        System.out.println("a <= b = " +(a <= b)); // true
        System.out.println("a == b = " +(a == b)); // false
        System.out.println("a != b = " + (a != b)); // true

    }
}
