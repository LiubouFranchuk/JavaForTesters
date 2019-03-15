package com.epam.cdp.Module_6;

import java.sql.*;
import java.util.Random;


public class ScrollableStatementSample {

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
        PreparedStatement st = null;

        try {
            conn = getConnection();
            st = conn.prepareStatement("SElECT * FROM prices ");
            printNames(st);
            //this was done by RMC -> Refactor -> Extract --> Method


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        if (st!=null) {
            st.close();
        }
            if (conn!=null){
                conn.close();
                //connection should walways be closed afterwards
            }
        }
    }

    private static void printNames(PreparedStatement st) throws SQLException {


        ResultSet rs = st.executeQuery();
        //reversed list of results
        rs.afterLast();
        while (rs.previous()){
            System.out.println(rs.getRow() + " " + rs.getString(2) + " " + rs.getString(4));
        }

        //absolute row position
        rs.absolute(10);
        System.out.println(rs.getRow());
    }






    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + DB_NAME, USER_NAME, PASSWORD);
    }
}
