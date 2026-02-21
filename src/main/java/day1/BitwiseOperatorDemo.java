package day1;

import java.util.Scanner;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        //  And and or

        // And - & (both conditions must be true)
        // true & true = true
        // true & false = false
        // false & true = false
        // false & false = false

        // Or -  | (any of condition is true then true)
        // true | true = true
        // true | false = true
        // false | true = true
        // false | false = false

        // less then 18 and Marks < 80 = Rank4
        // less then 18 and marks > 80 = Rank 3
        // more then 18 and marks  < 80 = rank 2
        // more then 18 and marks  > 80 = rank 1

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your Marks");
        int marks = scan.nextInt();

        // bitwise - always check both conditions
        // logical -think logically

        if(age <= 18 && marks < 80){
            System.out.println("Rank 4");
        }else if(age <= 18 && marks > 80){
            System.out.println("Rank 3");
        }else if(age >= 18 && marks < 80){
            System.out.println("Rank 2");
        }else{
            System.out.println("Rank 1");
        }



    }
}
