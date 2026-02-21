package day1;

import java.util.Scanner;

public class LogicalOperatorDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age first then your class : ");
        // if age < 18 , then no need to enter class
        // if age > 18 then enter class
        if(scan.nextInt() > 18 & scan.nextInt() > 10 ){
            System.out.println("Inside If");
        }else{
            System.out.println("Inside else");
        }


    }
}
