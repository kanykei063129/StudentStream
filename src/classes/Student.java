package classes;

import enums.Gender;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private int price;
    private String surname;

    public Student(String name, int age, Gender gender, int price, String surname) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
        this.surname = surname;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", price=" + price +
                ", surname='" + surname + '\'' +
                '}';
    }
}
