package com.njcodeing.Challenge81;

import java.util.Objects;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
