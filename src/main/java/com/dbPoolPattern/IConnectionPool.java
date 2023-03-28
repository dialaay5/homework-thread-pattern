package com.dbPoolPattern;

import java.sql.Connection;

public interface IConnectionPool {
    Connection getConnection1() throws InterruptedException;

    void returnConnection(Connection conn);


}
