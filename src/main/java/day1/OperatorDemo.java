package day1;


import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        // what is operator ?

        // 10 % 5 = 15,5,50,2,0
        // operator +,-,*,/,%
        // 10, 5 = operand

        // Arithmatic Operator , +,-,*,/,%

        int i = 12;
        int j = 5;
//        System.out.println(i + j);  // 17
//        System.out.println(i - j);   // 7
//        System.out.println(i * j); // 60
//        System.out.println((float)i / (float)j); // 2.4
//        System.out.println(i % j); // 2
        // BODMAS
        // BO(DMR)(AS)

        //System.out.println( 10 + 60 / 6 * 2 );

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your 2 digit number");
        int num = scan.nextInt();
        int lastDigit = num % 10;  // 6
        int restNumberExceptLastDigit = num / 10;  // 5
        int sum = lastDigit + restNumberExceptLastDigit;
        System.out.println("Sum : " +sum);

        // sum of all digit present in this number
        //
// Reminder rule
        // any value by 10  = last digit
        // any value by 2 =


        // 30
        // 20
        // 22

    }
}
