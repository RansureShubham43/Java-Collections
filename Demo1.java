package com.arraylist;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("Apple");
        al.add("Bannana");
        al.add("Mango");
        al.add("Mosambi");
        al.add("Orange");
        System.out.println("List Sorted in Ascending order");
        Collections.sort(al);
        al.forEach(System.out::println);
        System.out.println("List in Reverse Order");
        Collections.reverse(al);
        al.forEach(System.out::println);
    }
}
