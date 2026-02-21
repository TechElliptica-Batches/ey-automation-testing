package day4;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
        // 100% object oriented language
        // int
        // byte
        // short
        // long

        // parsemethod
        // ParseXXX

        String s1 = "10";
        String s2 = "20";
        Integer s3 = Integer.parseInt(s1) + Integer.parseInt(s2);;
        System.out.println(s3);

        List<Integer> ls = new ArrayList<>();
        int a = 10;
        ls.add(a);

        // int -> autoboxing -> Integer
        // Integer -> Unboxing -> int

        int k = 10;
        Integer k1 = k;

        Integer m1 = 40;
        int m2 = m1;


        int i = 10;
        int h = i +5;

        System.out.println(h);

        Integer j = 10;
        System.out.println(Integer.toOctalString(j));
       // Integer k = j +5;

        //System.out.println(k);

        // Integer - many method


    }
}
