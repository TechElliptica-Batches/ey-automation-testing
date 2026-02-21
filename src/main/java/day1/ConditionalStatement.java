package day1;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // provide age is less then 18 , then print child
        // else print adult

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if( age <= 18 ){
            System.out.println("Child");
        }else{
            System.out.println("Adult");
        }

        // 5 min
        // take a number from user
        // check if number is even or odd
        // if number is even = print even
        // if number is odd = print odd


    }
}
