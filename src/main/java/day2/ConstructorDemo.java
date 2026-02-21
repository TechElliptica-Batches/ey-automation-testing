package day2;

public class ConstructorDemo {
    public static void main(String[] args) {
         // Ref part  =  Object Part
        // Object creation process
        // new - going to my java memory, memory (instanciation)
        // Car() - constructor

        // every class has a default constructor - not visible
        // non-parameterized

        // how do we create constructor in a class explicitly
        // there is no return type
        // constructor name will be same as class name

        Car c1    =  new Car("Audi");
        System.out.println(c1.brand);

    }
}

class Car{
    String brand;

    Car(){
        System.out.println("Hello");
    }
    Car(String brand){
        this.brand = brand;
    }



    public void Car(){
        System.out.println("hello m1");
    }




}
