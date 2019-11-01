package com.app.service;

public class User {
    private final int id;
    private final String nickName;
    private final String password;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String sex;
    private final int age;
    private final String address;

    public User(BuilderUser builderUser) {
        this.id = builderUser.id;
        this.nickName = builderUser.nickName;
        this.password = builderUser.password;
        this.email = builderUser.email;
        this.firstName = builderUser.firstName;
        this.lastName = builderUser.lastName;
        this.sex = builderUser.sex;
        this.age = builderUser.age;
        this.address = builderUser.address;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public java.lang.String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
