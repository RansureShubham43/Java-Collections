package com.arraylist;
import java.util.ArrayList;


record Customer(Integer custId,String custName,Double bill){

}
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Customer> cl=new ArrayList<>();
        cl.add(new Customer(101,"Shubham",1000.10));
        cl.add(new Customer(102,"Ajay",200.2));
        cl.add(new Customer(103,"Prathmesh",4566.00));
        cl.forEach(System.out::println);
        

    }
}
