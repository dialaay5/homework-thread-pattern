package com.postgresql;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        // 1
        Class.forName("org.postgresql.Driver");

        Connection connection = null;

        try
        {
            // 2
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/functionxy", "admin", "admin");
            // 3
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery( "SELECT * FROM functionxy" );
            while ( rs.next() ) {
                int rownumber = rs.getInt("rownumber");
                int x  = rs.getInt("x");
                int y = rs.getInt("y");
                System.out.println( "rownumber = " + rownumber );
                System.out.println( "x = " + x );
                System.out.println( "y = " + y );
                System.out.println();
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
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
