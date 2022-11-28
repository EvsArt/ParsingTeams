package org.example;

import java.io.*;
import java.sql.*;
import java.util.HashSet;

public class DBWorking {
    Connection connection;
    Statement statement;

    public void connectDB(){
        connection = connection();
        assert connection != null;

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/secsysproj","postgres", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void disconnectDB(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addOneEmail(String email){

        int maxId = 0;
        ResultSet res;

        try {
            res = statement.executeQuery("SELECT Max(ID) as max FROM members");
            if(res.next()) maxId = res.getInt("max");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String query = "INSERT INTO members" +
        " (id, email) " + " VALUES (" + (maxId+1) + ", '" + email + "')";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Ошибка с " + query);
        }
    }

    public void addAllEmails(HashSet<String> emails){

        connectDB();
        for (String email: emails) {
            addOneEmail(email);
        }
        disconnectDB();

    }

    public void addAllEmailsFromFile(String fileName) {

        connectDB();
        try {

            File file = new File("src/main/resources/" + fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                addOneEmail(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        disconnectDB();

    }


}
