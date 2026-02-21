package day1;

public class UnaryDemo {
    public static void main(String[] args) {
        // + - ++ -- ! ~
        // Unary - one operand
        // increment and decrement

        //i = i + 1;
        // increment , assignment
        // i++ = post increment (first assign then increase)
        // ++i = pre increment (first increase then assign)

        int i = 10;
        int j = i-- + --i + i++ + i++;
        //      10  + 12  + 12  + 13

        System.out.println("j : " + j);
        System.out.println("i : " + i);

        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
