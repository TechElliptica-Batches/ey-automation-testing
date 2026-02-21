package day1;

public class UnicodeDemo {
    public static void main(String[] args) {
        // 2 bytes = 16 bits

        char ka = '\u0935';
        char matra = '\u0948';
        char bha = '\u092D';
        System.out.println("" + ka + matra + bha + ka);


    }
}
