package org.example.creationalPattern.Builder;

public class Person {
    private final String name;
    private final int age;

    // Only constructor - private, for Builder
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static class PersonBuilder {
        private  String name;
        private int age = 0;

        public PersonBuilder name(String name) {
            this.name = name;
            return  this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args){

        Person person = new PersonBuilder().age(20).name("ss").build();
        System.out.println(person.getName());
    }
}