package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.ManagmentModel;
import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.dao.UserDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public boolean addUser(ManagmentModel model) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "INSERT INTO user VALUES(?,?,?,?,?,?,?,?)"
            );

            statement.setInt(1,0);
            statement.setString(2, model.getName());
            statement.setString(3, model.getLastname());
            statement.setString(4, model.getUsername());
            statement.setString(5, model.getEmail());
            statement.setString(6, model.getPhoneNumber());
            statement.setString(7, model.getAccessCode());
            statement.setBoolean(8, false);

            statement.execute();
            statement.close();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
