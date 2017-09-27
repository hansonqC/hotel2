package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.RoomModel;
import pl.teamjava.hotel.models.UserModel;
import pl.teamjava.hotel.models.dao.ManagmentDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagmentDaoImpl implements ManagmentDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public List<String> showProperties(String accessCode) {

        List<String> propertiesList = new ArrayList<String>();

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "SELECT name FROM place WHERE accessCode = ?"
            );

            statement.setString(1, accessCode);
            ResultSet set = statement.executeQuery();

            while(set.next()){
                propertiesList.add(set.toString());
            }

            statement.close();
            return propertiesList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean addRoom(RoomModel model) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "INSERT INTO room VALUES(?,?,?,?,?) "
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteRoom(String name) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "DELETE FROM room WHERE name = ?"
            );

            statement.setString(1, name);
            statement.execute();
            statement.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editRoom(RoomModel model) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    "UPDATE room SET "
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addProperty(String accessCode) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteProperty(String name) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addToBlockedList(UserModel userModel) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<UserModel> showBlockedList(String accessCode) {

        List<UserModel> blockedList = new ArrayList<UserModel>();

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return blockedList;
    }

    public boolean isRoomBooked(String name, String nameOfProperty) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
