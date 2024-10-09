package com.arraylist;
import java.util.ArrayList;
public class DemoMergeAndRetainTwoCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("First ArrayList");
        al.forEach(System.out::println);
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(40);
        al1.add(50);
        al1.add(60);
        System.out.println("Second ArrayList");
        al1.forEach(System.out::println);
        System.out.println("Merging Two ArrayList");
        al.addAll(al1);
        al.forEach(System.out::print);
    }
}
