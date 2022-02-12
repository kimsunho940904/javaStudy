package com.npring.dbTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
public class OracleConnectionTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://database-1.cncw4vvaxujb.us-east-1.rds.amazonaws.com:3306/sys?serverTimezone=UTC&characterEncoding=UTF-8";
    private static final String username = "admin";
    private static final String password = "admin123";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
