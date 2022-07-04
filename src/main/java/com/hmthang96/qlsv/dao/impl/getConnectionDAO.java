package com.hmthang96.qlsv.dao.impl;

import java.sql.DriverManager;
import java.sql.SQLException;

public class getConnectionDAO {
    java.sql.Connection getConnectionDAO() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://locahost:3306/studentdb";
            String user = "root";
            String password = "Missroine12";
            return DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
