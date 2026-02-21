package day4;

public class MathDemo {
    public static void main(String[] args) {
         // 4 power 2 = 4 * 4 = 16
        // 16 power 0.5
        //System.out.println(Math.pow(4,3.2));
        // 1 to 100

        // 100 and 200

        String temp = "abcdefghijklmopqrstuvwxyz";

        int start = 100;
        int end = 600;
        int range = end - start;
        String rStr = "";
        for(int i = 1; i < 10 ; i++) {
            int randomNumber =  (int)(Math.random() * temp.length());
            rStr = rStr + temp.charAt(randomNumber);
        }
        System.out.println( rStr );
    }
}
