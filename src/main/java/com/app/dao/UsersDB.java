package com.app.dao;

import com.app.service.BuilderUser;
import com.app.service.User;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsersDB {
        private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private static final String DB_URL = "jdbc:mysql://localhost/javachatdb";
        private static String DB_USER = "root";
        private static String DB_PASSWORD = "1122";

    public static ArrayList<User> select() {
        ArrayList<User> users = new ArrayList<>();

        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
                while (resultSet.next()) {

                    int id = resultSet.getInt(1);
                    String nickName = resultSet.getString(2);
                    String password = resultSet.getString(3);
                    String email = resultSet.getString(4);
                    String firstName = resultSet.getString(5);
                    String lastName = resultSet.getString(6);
                    String sex = resultSet.getString(7);
                    int age = resultSet.getInt(8);
                    String address = resultSet.getString(9);
                    User user = new BuilderUser(nickName, password, email)
                            .withFirstName(firstName)
                            .withLastName(lastName)
                            .withSex(sex)
                            .withAge(age)
                            .withAddress(address).build();
                    users.add(user);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return users;
    }

    public static User selectUserByEmailByPassword(String nickName, String password) {
        User user = null;

        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

                String sql = "SELECT * FROM user WHERE nickName=? AND password=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(2, nickName);
                    preparedStatement.setString(3, password);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){

                        int id = resultSet.getInt(1);
                        String nick = resultSet.getString(2);
                        String pass = resultSet.getString(3);
                        String email = resultSet.getString(4);
                        String firstName = resultSet.getString(5);
                        String lastName = resultSet.getString(6);
                        String sex = resultSet.getString(7);
                        int age = resultSet.getInt(8);
                        String address = resultSet.getString(9);
                        user = new BuilderUser(nick, pass, email)
                                .withId(id)
                                .withFirstName(firstName)
                                .withLastName(lastName)
                                .withSex(sex)
                                .withAge(age)
                                .withAddress(address).build();
                    }
                }
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        return user;
    }

    public static User selectOne(int userId) {

        User user = null;
        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){

                String sql = "SELECT * FROM user WHERE id=?"; //id or userId ???
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, userId);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){

                        int id = resultSet.getInt(1);
                        String nickName = resultSet.getString(2);
                        String password = resultSet.getString(3);
                        String email = resultSet.getString(4);
                        String firstName = resultSet.getString(5);
                        String lastName = resultSet.getString(6);
                        String sex = resultSet.getString(7);
                        int age = resultSet.getInt(8);
                        String address = resultSet.getString(9);
                        user = new BuilderUser(nickName, password, email)
                                .withFirstName(firstName)
                                .withLastName(lastName)
                                .withSex(sex)
                                .withAge(age)
                                .withAddress(address).build();
                    }
                }
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        return user;
    }

    public static int insert(User user) {
        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){

                String sql = "INSERT INTO user (nickName, password, email) Values (?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, user.getNickName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3, user.getEmail());

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(User user) {

        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){

                String sql = "UPDATE user SET nickName = ?, password = ?, email = ?, firstName = ?, lastName = ?, sex = ?, age = ?, address = ? WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, user.getNickName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3, user.getEmail());
                    preparedStatement.setString(4, user.getFirstName());
                    preparedStatement.setString(5, user.getLastName());
                    preparedStatement.setString(6, user.getSex());
                    preparedStatement.setInt(7, user.getAge());
                    preparedStatement.setString(8, user.getAddress());

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }

    public static int delete(int userId) {

        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){

                String sql = "DELETE FROM user WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, userId);

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}
