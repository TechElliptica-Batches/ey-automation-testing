package day2;

import java.util.Date;

public class EncapsulationDemo {
    public static void main(String[] args) {
    // getter and setter method
    // POJO class - Plain Old Java object
    // lombok

        Bank b1 = new Bank("HDFC", "HDFC1234");
        System.out.println(b1.getName());
        System.out.println(b1.getIfscCode());

    }
}

// POJO class - getter and setter
class Bank{
    Bank(String name, String ifscCode){
        this.name = name;
        this.ifscCode = ifscCode;
    }

    private String name;
    private String ifscCode;

    public String getName() {
        return name;
    }

    public String getIfscCode() {
        return ifscCode;
    }


}