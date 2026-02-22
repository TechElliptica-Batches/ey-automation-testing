package day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //Map - Dictionary
        // word - meaning
        // key (unique)  - value (can be duplicate)
        // HashMap, LinkedHashMap and TreeMap

        Map<String, String> m1 = new TreeMap<>();
        m1.put("name", "Vaibhav");
        m1.put("designation", "Trainer");
        m1.put("age", "12");
        m1.put("class", "10th");

        // map update the values if we try to give same key again with other value,
        // then it will update that value
        System.out.println(m1);

        // properties is file presentation of Map


    }
}
