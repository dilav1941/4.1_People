package com.company;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddres() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!hasAddres ()) {
            this.address = address;
        } else {
            this.address = address;
            System.out.println ("Изменен адрес" + address);
        }
    }

    public void birthday() {
        if (hasAge ()) {
            this.age += 1;
        } else {
            System.out.println ("Возраст неизвестен");
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return "Person: " +
                "имя = '" + name + '\'' +
                ", фамилия = '" + surname + '\'' +
                ", возраст = " + age +
                ", адрес = '" + address + '\'' + "\n";
    }
}