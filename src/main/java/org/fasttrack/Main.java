package org.fasttrack;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bu", 4);
        System.out.println(person.getAge() + "  " + person.getName());
        person.setAge(23);
        person.setName("sda");
        System.out.println(person.getAge() + "  " + person.getName());

        System.out.println(person);

    }
}
