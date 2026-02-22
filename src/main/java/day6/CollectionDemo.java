package day6;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection - data dynamically
        // List
        // Set
        // Map

        // Basic understanding on List

        // List - ordered, duplicates allowed in list , arraylist and linkedlist
        // Set - no duplicate allowed , unordered, duplicate not allowed  - hashset, linkedhashset and treeset
        //  HashSet = save the data based on hash algo so not ordered
        // LinkedHashSet = ordered
         // TreeSet = sorted

        Set<Employee> ls = new TreeSet<>();
        ls.add(new Employee("Vaibhav", 40000));
        ls.add(new Employee("Anubhav", 70000));
        ls.add(new Employee("Pooja", 10000));
        ls.add(new Employee("Deepti", 50000));
        ls.add(new Employee("Harsh", 90000));

        for(Employee e : ls){
            System.out.println(e);
        }
    }
}

class Employee implements Comparable<Employee>{
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    String name;
    int salary;

    @Override
    public int compareTo(Employee o) {
        return  salary - o.salary;
    }

    @Override
    public String toString() {
        return this.name + " <=> " + this.salary;
    }
}
