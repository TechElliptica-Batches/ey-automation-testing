package day4;

public class StringDemo {
    public static void main(String[] args) {
        // Litral way
        String s1 = "Pune";  // Pune
        String s2 = "Pune";  // Pune
        String s3 = "Mumbai"; // Pune, Mumbai
        String s4 = "Pune";  // Pune, Mumbai
        String s5 = "Delhi"; // Pune, Mumbai, Delhi


        // String is class
        // Object Way
        String s6 = new String("Pune");  // Pune, Mumbai, Delhi, 1pointing object
        String s7= new String("Kolkata"); // Pune, Mumbai, Delhi,kolkata,  2 pointing object

//         ==




    }
}
