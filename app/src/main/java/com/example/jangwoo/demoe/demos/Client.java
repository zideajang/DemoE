package com.example.jangwoo.demoe.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Client {

    public static String customerByID(List<Customer> custList, final int custID){
        Optional<Customer> customer = custList.stream()
                .filter( c -> c.getID()==custID)
                .findFirst();
        return  customer.isPresent()? customer.get().getName() :"undefined";

    }

    public static void main(String[] args) {

        Customer zidea = new Customer(123);
        zidea.setName("zidea");

        List<Customer> list = new ArrayList<>();
//        list.add(zidea);
//
        System.out.println(customerByID(list,123));

        System.out.println("ok");

    }
}
