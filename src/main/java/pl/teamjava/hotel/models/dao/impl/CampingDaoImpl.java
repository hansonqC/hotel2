package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.dao.CampingDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CampingDaoImpl implements CampingDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public List<String> getAllCampingNames() {
        List<String> campingList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Camping");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                campingList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return campingList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<String> getCampingsNames(String cityname) {
        List<String> sortedCampingList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Camping ORDER BY city = ?");

            preparedStatement.setString(1,cityname);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                sortedCampingList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return sortedCampingList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getFreeCampings() {
        List<String> FreeCampingList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Camping AND isBooked = 0");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                FreeCampingList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return FreeCampingList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getCheapCamping() {
        List<String> CheapCampingList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Camping INNER JOIN room ON room.id = place.id");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                CheapCampingList.add(resultSet.getString("place.name"));
            }

            resultSet.close();
            return CheapCampingList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getOpinionHotel() {
        return null;
    }
}
