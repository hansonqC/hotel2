package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.UserModel;
import pl.teamjava.hotel.models.dao.ManagmentDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagmentDaoImpl implements ManagmentDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public List<String> showProperties(String accessCode) {

        List<String> propertiesList = new ArrayList<String>();

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return propertiesList;
    }

    public void addRoom(String accessCode) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteRoom(int id) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void editRoom(int id) {

        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addProperty(String accessCode) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProperty(int id) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addToBlockedList(UserModel userModel) {
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement(
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public boolean isRoomBooked(int id, String nameOfProperty) {

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
