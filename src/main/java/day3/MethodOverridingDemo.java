package day3;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.interestRate();
    }
}
// override is also a update activity
class Bank{
    public D2 interestRate(){
        System.out.println("5.5");
        return null;
    }
}
class HDFC extends Bank{
    public D3 interestRate(){
        System.out.println("6.5");
        return null;
    }
}

class D1{ }
class D2 extends D1{}
class D3 extends D2{}
// Rule 1 - Access modifier rule - public > protected > default > private
// we cannot reduce the visibility of method
// Rule 2  - final keyword
// final cannot be overridden
// Rule - private method dont override
// Rule 3 - Return type rule
