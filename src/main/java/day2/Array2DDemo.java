package day2;

public class Array2DDemo {
    public static void main(String[] args) {
        int[] student1Marks = {40,60,80,90};
        int[] student2Marks = {46,69,78,94};
        int[] student3Marks = {12,70,90,92};

        // 2Dimentional Array , Excel
        int[][] allStudents = {
                student1Marks,   // 0
                student2Marks,   // 1
                student3Marks    // 2
        };

        for(int i = 0 ; i < allStudents.length ; i++){
            int[] arr = allStudents[i];
            int totalmarks = 0;
            for(int j = 0 ; j < arr.length ; j++){
                System.out.println(arr[j]);
                totalmarks = totalmarks + arr[j];
            }
            System.out.println("Percentage : " + (float)totalmarks / arr.length);
            System.out.println(" ================  ");
        }

    }
}
