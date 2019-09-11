package com.github.sindrebn._2_function;

public class Person {

    private long id = 1;
    private String name = "Sindre";
    private int age = 29;

    private Person() {
    }

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static class Builder {
        Person person;

        private Builder() {
            this.person = new Person();
        }

        Builder withName(String name) {
            person.name = name;
            return this;
        }

        Builder withAge(int age) {
            person.age = age;
            return this;
        }

        Person build() {
            return person;
        }
    }
}
