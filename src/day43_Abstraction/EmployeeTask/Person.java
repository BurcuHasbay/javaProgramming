package day43_Abstraction.EmployeeTask;

import day06_PrimitiveTypeCastings.PrimitiveCastings;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public abstract void sleep();
    private void eat() {
        System.out.println(name + " is eating baklava");
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
        if (age <= 0){
            throw new RuntimeException("Invalid age " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            throw  new RuntimeException("Invalid gender " + gender);
        }
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                '}';
    }





}
