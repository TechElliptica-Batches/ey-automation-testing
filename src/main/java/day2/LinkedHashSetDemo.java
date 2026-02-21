package day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Set -  basic  - do not allow duplciates
        // HashSet - not ordered
        // LinkedHashSet - ordered
        // TreeSet - sorted
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter your marks");
            int mark = scan.nextInt();
            ls.add(mark);
            System.out.println(ls);

        }
        // System.out.println("My Final list : "  + ls);
    }
}
