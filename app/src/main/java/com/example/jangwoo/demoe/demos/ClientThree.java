package com.example.jangwoo.demoe.demos;

import java.util.function.Supplier;

public class ClientThree {

    public static void printCustomer(Supplier<Customer> customerSupplier){
        System.out.println(customerSupplier.get().getName());
    }


    public static Customer createCusomer(){
        Customer customer1 = new Customer(2,"jerry");
        return customer1;
    }

    public static void main(String[] args) {
//        Supplier<Customer> customerSupplier = ()-> new Customer(123,"zidea");
        Supplier<Customer> customerSupplier = () -> createCusomer();

        printCustomer(customerSupplier);
    }
}
