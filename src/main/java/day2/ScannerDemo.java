package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];  // array with size 4
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.println("Enter your marks");
            int mark = scan.nextInt();
            arr[i] = mark;
            System.out.println(Arrays.toString(arr));
            i++;
        }
        // Collection
        // List - ArrayList, LinkedList
        // Set - HashSet, LinkedHashSet, TreeSet


    }
}
