package com.jason.showcase.java8;

/**
 * Created by Qinjianf on 2016/7/21.
 */
public class Person {
    String firstName;
    String lastName;
    Person() {}
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.lastName + " · " + this.firstName;
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
