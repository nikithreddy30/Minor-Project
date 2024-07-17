package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection;

    public static Connection getConnection() {
        //TO load class-className:fully classified name
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //to register the driver class
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?useSSL=false", "root", "admin1234");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to MySQL Succesfully");
        return connection;
    }
    public static void closeConnection(){
        if(connection!=null){
            try{
                connection.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

}

