package day5;

public class TestometerException extends Exception{
    public TestometerException(String msg){
        System.out.println("----------Testometer Exception found ---------");
        System.out.println(msg);
        System.out.println("----------Testometer Exception End ---------");
    }
}


// 1 - extends Exception class