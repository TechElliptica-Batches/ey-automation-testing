package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        // List = ArrayList and LinkedList
        // generics
        // List - ordered in nature base nature
        // allow duplicates
        // list is index
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter your marks");
            int mark = scan.nextInt();
            ls.add(mark);
            System.out.println(ls);
        }
        //System.out.println("My Final list : "  + ls);
    }
}
