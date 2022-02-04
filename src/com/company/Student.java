package com.company;
// • Студент деген класс тузунуз
// • туулган куну, аты, фамилиāсы, жашы
// • Эки класскатен конструкторлорду тузуу жана по умолчанию конструкторду
//  да тузуу
// • Студенттин жашын терс эмес сан экенин текшеруу керек

public class Student {
    private String name;
    private String birthday;
    private String surname;
    private int age;

    public Student (String name, String birthday, String surname,int age) {
        this.name=name;
        this.birthday=birthday;
        this.surname=surname;
        if (age<=0) {
            System.out.println("invalid age");
        }else {
            this.age = age;
        }
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0) {
            System.out.println("invalidage");
        }else {

        }
        this.age = age;
    }
}

