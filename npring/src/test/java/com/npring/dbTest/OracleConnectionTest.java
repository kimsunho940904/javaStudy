package com.npring.dbTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
public class OracleConnectionTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

//    @Test
//    public void testConnection() throws Exception {
//        Class.forName(DRIVER);
//        try {
//            Connection connection = DriverManager.getConnection();
//            System.out.println(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
