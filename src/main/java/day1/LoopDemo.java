package day1;

public class LoopDemo {
    public static void main(String[] args) {
        // loop - block will execute until condition not false
        // while - first condition check  then execution of block
        // do while - first execution happen then condition check - always execute atleast once
        // for - structured loop
        int a = 20;
        do{
            System.out.println("Hello " + a);
            a++;
        }while(a <= 10);

//        while(a <= 10){
//
//        }
    }
}
