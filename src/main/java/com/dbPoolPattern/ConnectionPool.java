package com.dbPoolPattern;
import java.util.LinkedList;
import java.util.Queue;
import java.sql.*;


public class ConnectionPool implements IConnectionPool {

    final static int max = 3;
    final static Object key = new Object();
    final static Object pool_key = new Object();
    private static ConnectionPool INSTANCE = null;

    Queue<Connection> connections = new LinkedList<Connection>();

    private ConnectionPool() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        for (int i = 0; i < max; i++) {
            connections.add(DriverManager.getConnection("jdbc:sqlite:C:\\Users\\97250\\Desktop\\full stack\\02.01.2023 express database\\db\\db_rest.db"));
        }
    }

    @Override
    public Connection getConnection1() throws InterruptedException {
        synchronized (pool_key) {
            while (connections.size() == 0) {
                System.out.println(Thread.currentThread().getName() + " the thread is waiting");
                pool_key.wait();
            }

            Connection conn = connections.remove();
            System.out.println(Thread.currentThread().getName() +" getted connection");
            return conn;

        }
    }

    @Override
    public void returnConnection(Connection conn) {
        synchronized (pool_key) {
            connections.add(conn);
            System.out.println(Thread.currentThread().getName() + " returned connection");
            pool_key.notifyAll();
        }
    }


    public static ConnectionPool getInstance() throws SQLException, ClassNotFoundException {
        if (INSTANCE == null ){
            synchronized (key) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }

        return INSTANCE;
    }

}
