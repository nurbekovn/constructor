package com.company;
//   // Курс деген класс тузунуз
// • аты, номери, мугалимдин аты жону, курс башталган кун
// • Студент деген класс тузунуз
// • туулган куну, аты, фамилиāсы, жашы
// • Эки класскатен конструкторлорду тузуу жана по умолчанию конструкторду
//  да тузуу
// • Студенттин жашын терс эмес сан экенин текшеруу керек

public class Course {

    private String name;
    private String number;
    private int age;
    private double days;

    public Course (String name, String number, int age, int day, int days) {
        this.number = number;
        this.name = name;
        this.days=days;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }


}



