package com.njcodeing.Challenge81;

public class TestPerson {
    public static void main(String[] args) {
        Person boy1=new Person("Raj",29);
        Person man=new Person("Leonard",28);
        Person boy2=new Person("Raj",29);

        System.out.println(boy1.equals(boy2));
        System.out.println(boy1.hashCode());// must be equal to boy2 if boy1=boy2
        System.out.println(boy2.hashCode());// must be equal to boy1 if boy1=boy2

        System.out.println(boy1.equals(man));
        System.out.println(man.hashCode());//may be equal to boy1 or boy2 if boy1 != boy2
    }
}
