package day1;

public class ForLoop {
    public static void main(String[] args) {
        // emp = 5 , dont credit salary
        for (int i = 1; i <= 10; i++) {
            if(i == 5)
                continue;
            System.out.println("salary credit for " + i);
        }

        // break - break a loop
        // continue - skip a loop iteration
    }
}
