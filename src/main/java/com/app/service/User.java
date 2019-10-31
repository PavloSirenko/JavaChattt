package com.app.service;

public class User {
    private int id;
    private String nickName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String address;

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public User(int id, String nickName, String password) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
    }

    public User(String nickName, String password, String email, String firstName, String lastName, String sex, int age, String address) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public User(int id, String nickName, String password, String email, String firstName, String lastName, String sex, int age, String address) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return  id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
