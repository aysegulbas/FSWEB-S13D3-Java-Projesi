package com.workintech.oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String city;
    String country;

public Person(String firstName,String lastName,int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
}
    public Person(String firstName,String lastName,int age,String gender,String city,String country){
    this(firstName,lastName,age);//constructor çağırımı yapıyoruz
    this.gender=gender;
    this.city=city;
    this.country=country;
    }
    public String getFirstName(){
    return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(int age){
    return age>=13&&age<=19;
    }
public String toString(){
    return String.format("Firstname:%s;Lastname:%s,Age:%d",firstName,lastName,age);
}
}
