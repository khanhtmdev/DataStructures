package hashSetExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));

        List<String> listA = new ArrayList<String>();
        // chuyển đổi setA thành listA
        listA.addAll(setA);
        System.out.println(listA);
    }
}
