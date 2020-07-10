package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {


        try (Connection conn = DBUtil.connect()) {
           

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
