package com.mentoring.mju.v1.example;

public class Person {

    private final String name;
    private int age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public void addAge() {
        this.age++;
        if (age>=30){
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String convertUptoLow(String beforeName){

        beforeName = this.name.toLowerCase();
        return beforeName;
    }
}
