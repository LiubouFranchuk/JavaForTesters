package com.epam.cdp.Module_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSample {

    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_NAME = "shop";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "pass";


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(DRIVER);
        // mysql-connector-java-5.1.38-bin.jar file will be added to External Libraries
        //driver can be downloaded from File -> Project Structure -> Libraries -> Maven -> com.mysql.jdbc ->search
        //mysql workbench is a tool for DB management
        Connection conn = null;
        Statement st = null;

        try {
            conn = getConnection();
            st = conn.createStatement();
//st.executeQuery(); --> to READ
            // executeUpdate = INSERT
            st.executeUpdate("CREATE TABLE Sellers "
                    + " (id INTEGER not NULL, " +
                    "(name VARCHAR (40), PRIMARY KEY (id))");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        if (st!=null) {
            st.close();
        }
            if (conn!=null){
                conn.close();
            }
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + DB_NAME, USER_NAME, PASSWORD);
    }
}
