package com.dbPoolPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EightmultiThreads extends Thread{
    protected String sqlQuery;

    public EightmultiThreads(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public void run() {
        Connection conn = null;
        try {
            conn = ConnectionPool.getInstance().getConnection1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            statement.executeUpdate(this.sqlQuery);
            System.out.println(this.sqlQuery + Thread.currentThread().getName());
        } catch (SQLException e) {
            // Handle exception
        } finally {
            try {
                ConnectionPool.getInstance().returnConnection(conn);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
