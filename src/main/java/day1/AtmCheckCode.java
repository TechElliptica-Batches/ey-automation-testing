package day1;


import java.util.Scanner;

public class AtmCheckCode {
    public static void main(String[] args) {

        int threshold = 3;
        int times = 0;
        Scanner scan = new Scanner(System.in);
        int expectedPin = 1234;
        do{
            System.out.println("Enter your pin");
            int userProvidedPin = scan.nextInt();
            if(userProvidedPin == expectedPin){
                System.out.println("Successful pin entered");
                break;
            }else{
                times++;
                if(times > threshold){
                    System.out.println("Account is locked");
                    break;
                }
            }
        }while(times <= threshold);



    }
}
