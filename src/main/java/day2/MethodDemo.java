package day2;

public class MethodDemo {

    public static void main(String[] args) {
        float sum = Calculator.add(34.5f, 45.4f);
        System.out.println(sum);
    }
    // what is method , function, def
    // service
    // input
    // logic
    // output

    // add = method name
    // input - parameters
    // logic = method body
    // output = return value
    // 30, 50 = arguments, when we are calling methods. values provided to param known as arguments
}
// Method Overloading
// you are giving differtn number of param or differnt type of param.
class Calculator{
    static int add(int a, int  b){
        return a + b;
    }
    static int add(int a, int  b, int c){
        return a + b + c;
    }
    static float add(float a, float  b){
        return a + b;
    }

    int multiply(int a, int  b){
        return a * b;
    }
    int square(int a){
        return multiply(a,a);
    }
    // non-parameterized method
    double PI(){
        return 3.14;
    }
    // void method - no return required
    void print(String str){
        System.out.println(str);
    }

}
