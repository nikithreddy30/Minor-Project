package dao;

import db.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static boolean isExists(String email) throws SQLException {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select email from users");
        ResultSet rr = ps.executeQuery();
        while(rr.next()){
            String em = rr.getString(1);
            if(em.equals(email))
                return true;
        }return false;

    }
    public static int saveUser(User user) throws SQLException{
        Connection connection= MyConnection.getConnection();
        PreparedStatement ps =connection.prepareStatement("insert into users values(default value,?, ?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        return ps.executeUpdate();
    }
}
