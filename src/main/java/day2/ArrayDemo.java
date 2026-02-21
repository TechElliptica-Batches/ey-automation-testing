package day2;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // arrays

        // save your marks
        // math, science, art
        // Rules of array
        // 1 - array is index based - it starts with 0
        // 2 - once array is created, we cannot increase or descrease the zie

        int[] student1Marks = {80, 90, 70, 57}; // predefined value arr
        int[] arr = new int[4];  // normal - reserve


        int totalMarks = 0;
        for(int i = 0 ; i < student1Marks.length ; i++){
            totalMarks = totalMarks + student1Marks[i];
        }
        System.out.println("Final total Marks : " + totalMarks);
        float percentage = (float)totalMarks / (float)student1Marks.length;
        System.out.println("percentage  : " + percentage + " %");

        // > 80 = First
        // 60  - 80 = second
        //  < 60  = third

        // last index of the collection - outbound - 2 , // length - 1
        // size , length = 3
//        System.out.println(student1Marks.length);
//        System.out.println(Arrays.toString(student1Marks));
//
//        student1Marks[-1] = 95;
//        System.out.println(Arrays.toString(student1Marks));
        //System.out.println(student1Marks[3]); // 90

        //  calculate percentage of this student , ( 80 + 90 + 70 ) / 3

    }
}
