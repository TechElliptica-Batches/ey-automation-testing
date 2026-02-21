package day2;

public class Human {
//    Human characterisitcs = name, age, height, weight, country
//    behaviour - speak, run

    String name;
    int age;
    static String country = "India";

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void speak(String content){
        System.out.println(name +"["+age+"]" + " : " + content);
    }
    void happyBirthday(){
        System.out.println("Today is " + name + " birthday.");
        age++;
    }
}
// 1000 object
// india = 5 byte * 1000 = 5000 byte
// 50% java
// in order to call static entity , we dont need objects anymore
class HumanDemo{
    public static void main(String[] args) {
        Human h1 = new Human("Vaibhav", 34);
        Human h2 = new Human("Imran", 30);
        Human h3 = new Human("Pankaj", 40);
//        System.out.println(Human.country);
//        Human.country = "Bharat";
//        System.out.println(Human.country);
        h1.speak("Hello Guys");
        h2.speak("Hey ! How r u?");
        h3.speak("I am fine. How r u ?");
        h1.happyBirthday();
        h1.speak("I am good as well");
    }
}


// variable - instance and static - class variable
// vairbale  - always go with objects