package com.app.service;
/**
 *
 * The builder class.
 *
 */

public class BuilderUser {
    int id;
    final String nickName;
    final String password;
    final String email;
    String firstName;
    String lastName;
    String sex;
    int age;
    String address;

    public BuilderUser(String nickName, String password, String email) {
        if (nickName == null || password == null || email == null) {
            throw new IllegalArgumentException("nick, password and email can not be null");
        }
        this.nickName = nickName;
        this.password = password;
        this.email = email;
    }

    public BuilderUser withId(int id) {
        this.id = id;
        return this;
    }
    public BuilderUser withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public BuilderUser withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public BuilderUser withSex(String sex) {
        this.sex = sex;
        return this;
    }
    public BuilderUser withAge(int age) {
        this.age = age;
        return this;
    }
    public BuilderUser withAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
