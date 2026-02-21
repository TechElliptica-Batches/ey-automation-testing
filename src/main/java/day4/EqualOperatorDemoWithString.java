package day4;

public class EqualOperatorDemoWithString {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        String s4 = new String("Pune");

        // == always check first point of ref
        // intern

//        s3 = s3.intern();
//        s4 = s4.intern();

        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // true
        System.out.println(s3 == s4); // false

        // string - internally array of char


    }
}
