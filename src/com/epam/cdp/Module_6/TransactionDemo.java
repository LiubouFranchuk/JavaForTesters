package com.epam.cdp.Module_6;

import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep1= null;
        PreparedStatement prep2= null;
        PreparedStatement prep3= null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop",
                    "root", "pass");
            prep1 = conn.prepareStatement("SELECT * FROM customers WHERE sex = ?");
            prep1.setString(1, "male");

            ResultSet rs = prep1.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("firstname"));
            }



            // -------------------- UPDATE SEX -------------------------

            conn.setAutoCommit(false); //BEGIN TRANSACTION
            prep2 = conn.prepareStatement("UPDATE customers SET sex = 'female' " +
                    "WHERE id = ?" );
            prep2.setInt(1, 1);

            prep3 = conn.prepareStatement("UPDATE customers SET sex = 'male' " +
                    "WHERE id = ?" );
            prep3.setInt(1, 3);

            //but actually the tranasction begins here though we can still begin it above before preparations
            prep2.executeUpdate();
            prep3.executeUpdate();
            conn.commit(); //END TRANSACTION




        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {


        }

    }
}
