package com.sqlitee;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        // 1
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;

        try
        {
            // 2
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\97250\\Desktop\\full stack\\02.01.2023 express database\\db\\db_rest.db");

            // 3
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'leo')");
            statement.executeUpdate("insert into person values(2, 'yui')");
            ResultSet rs = statement.executeQuery("select * from person");
            while (rs.next()) {
                System.out.format("name = %s \n", rs.getString("name"));
                System.out.format("id = %d \n", rs.getInt("id"));
            }
        }
        catch (SQLException e) {

        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            }
            catch (SQLException e) {

            }
        }
    }
}

