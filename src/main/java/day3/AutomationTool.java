package day3;

public class AutomationTool {
    public static void main(String[] args) {
        Browser ch1 = new Chrome();
        // Ref         object
     // Ref side method will be visible
     // object side method will be executed because of overridiing
        ch1.click();
        ch1.sendKeys("hello");
        //ch1.chromesetup();
    }
}
// Runtime polymorphism
// for chrome overriding of click method is optional
// . you can make your browser class as abstract
// abstract - partial abstraction
//abstract class Browser{
//    public abstract void click();
//    public abstract  void sendKeys(String str);
//    public void m1(){
//
//    }
//}
//
// 1 class can implement n number of interfaces
// we cannot create object of abstract entity (abstract class, interface)
// interface can extend another interface

interface Browser{
    void click();
    void sendKeys(String str);
}

interface Browser1 extends Browser{
    void click1();
    void sendKeys(String str);
}
class Chrome implements Browser, Browser1{

    public void click(){
        System.out.println("Chrome : click");
    }
    public void sendKeys(String str){

    }
    public void click1(){

    }
}

class Edge implements Browser{
    public void click() {
        System.out.println("edge - click");
    }
    public void sendKeys(String str){

    }
}


