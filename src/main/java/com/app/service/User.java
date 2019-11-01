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

//    public User(String nickName, String password, String email) {
//        this.nickName = nickName;
//        this.password = password;
//        this.email = email;
//    }

//    public User(String nickName, String password, String email, String firstName, String lastName, String sex, int age, String address) {
//        this.id = id;
//        this.nickName = nickName;
//        this.password = password;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.sex = sex;
//        this.age = age;
//        this.address = address;
//    }

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

//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

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
