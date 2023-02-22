package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;


    private DBConnection(){
        try {
            forName("com.mysql.jdbc.Driver");
            connection=  DriverManager.getConnection("jdbc:mysql://localhost:3308/billing_system","root","");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
    public static DBConnection getInstance(){

        return  (dbConnection==null)? dbConnection=new DBConnection():dbConnection;
    }
    public Connection getConnection(){
        return  connection;
    }

}
