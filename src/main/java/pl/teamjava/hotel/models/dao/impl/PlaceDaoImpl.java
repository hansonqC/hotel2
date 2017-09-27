package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.dao.PlaceDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlaceDaoImpl implements PlaceDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public boolean editOptions(String accessCode) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "UPDATE place SET ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
