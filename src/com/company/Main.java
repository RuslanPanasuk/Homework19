package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person ruslan = new Person();
        ruslan.displayInformation();
        Person dimon = new Person("Dimon");
        dimon.displayInformation();
        Person olha = new Person("Olha", 26);
        olha.displayInformation();
    }
}
class Person {
    String name;
    int age;
    void displayInformation () {
        System.out.println("Name: " + name + " Age: " + age);
    }
    Person () {}
    Person (String name) {
        this.name = name;
    }
    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}