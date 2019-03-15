package com.epam.cdp.Module_6;

import java.sql.*;
import java.util.Random;


public class PreparedStmt {

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
            st = conn.prepareStatement("SElECT * FROM customers "
            + "WHERE sex = ?");

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
            }
        }
    }

    private static void printNames(PreparedStatement st) throws SQLException {

        //below is the code to get a random value
        if (new Random().nextBoolean()){
            st.setString(1, "male");
            System.out.println("Mam");
        } else {
            st.setString(1, "female");
            System.out.println("Woman");
        }

        ResultSet rs = st.executeQuery();
        while (rs.next()){
            System.out.println(rs.getRow() + " " + rs.getString("firstname"));
        }
    }



    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + DB_NAME, USER_NAME, PASSWORD);
    }
}
