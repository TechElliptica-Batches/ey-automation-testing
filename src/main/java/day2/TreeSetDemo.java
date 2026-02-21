package day2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Set -  basic  - do not allow duplciates
        // HashSet - not ordered
        // LinkedHashSet - ordered
        // TreeSet - sorted
        TreeSet<Integer> ls = new TreeSet<>();

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter your marks");
            int mark = scan.nextInt();
            ls.add(mark);
            System.out.println(ls);

        }
        // System.out.println("My Final list : "  + ls);

        // natural sorting - at the of insertion sorting
        // treeSet - faster (Comparable)

        // customized - already have entire data
        // (Comparator)

    }
}
