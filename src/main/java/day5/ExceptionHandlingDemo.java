package day5;

import org.apache.commons.lang3.ObjectUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
                System.out.print("Enter Number 1: ");
                int number1 = scan.nextInt();
                System.out.print("Enter Number 2: ");
                int number2 = scan.nextInt();
                try {
                    int div = MathCalculator.division(number1, number2);
                    System.out.println("Division is " + div);
                }catch (TestometerException e){
                    System.out.println(e.getCause());
                    e.printStackTrace();
                }
        }
    }
}

class MathCalculator{
    public static int division(int number1, int number2) throws TestometerException{
            if(number2 < 0){
                throw new TestometerException("Number 2 must be a positive Value. you are providing " + number2 +". its a negative value");
            }
            int div = number1 / number2;
            return div;

    }
}

// i want to create one exception as TestometerException when i am providing number 2 as negative number

/*
 Rule of try and catch
1 - only one try block is allowed but multiple catch block is allowed
2 - try cannot be alone
3 - Exception class is the parent of all exception . and it can handle all exception by default
4 - When we are using multiple catch block. always keep tha parent in the last.
 */



