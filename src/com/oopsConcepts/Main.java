package com.oopsConcepts;

public class Main {
    public static void main(String[] args) {

        //object
        //objects store in heap
        //reference store in stack
        Customer customer1;
        customer1 = new Customer();

        System.out.println("id : " + customer1.id);
        System.out.println("name : " + customer1.name);
        System.out.println("contact : " + customer1.contact);
        System.out.println("email : " + customer1.email);

        customer1.id = 111;
        customer1.name = "Alice";
        customer1.contact = "+91-987654321";
        customer1.email = "alice@gmail.com";

        System.out.println("id : " + customer1.id);
        System.out.println("name : " + customer1.name);
        System.out.println("contact : " + customer1.contact);
        System.out.println("email : " + customer1.email);

        Customer customer2;
        customer2 = new Customer();

        customer2.id = 222;
        customer2.name = "Bob";
        customer2.contact = "+91-9578373321";
        customer2.email = "bob@gmail.com";

        System.out.println("id : " + customer2.id);
        System.out.println("name : " + customer2.name);
        System.out.println("contact : " + customer2.contact);
        System.out.println("email : " + customer2.email);

        //case
        System.out.println(new Customer().email); //output null

        Customer customer3;

        customer3 = customer2; // two objects pointing to same address

        System.out.println(customer2.name);
        System.out.println(customer3.name);

        customer3.name = "Camy"; //since both are pointing to same address

        System.out.println(customer2.name);
        System.out.println(customer3.name);



    }
}
