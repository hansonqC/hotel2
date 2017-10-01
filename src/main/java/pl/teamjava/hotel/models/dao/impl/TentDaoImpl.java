package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.dao.TentDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TentDaoImpl implements TentDao {

    MySqlConnector connector = MySqlConnector.getInstance();

    public List<String> getAllTentsNames() {
        List<String> TentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Tent");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                TentList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return TentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getTentsNames(String cityname) {
        List<String> tentNameList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Tent ORDER BY city = ?");

            preparedStatement.setString(1,cityname);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                tentNameList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return tentNameList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getFreeTents() {
        List<String> freeTentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Tent AND isBooked = 0");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                freeTentList.add(resultSet.getString("name"));
            }

            resultSet.close();
            return freeTentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getCheapTent() {
        List<String> cheapTentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement("" +
                    "SELECT name FROM place WHERE place.category = Tent INNER JOIN room ON room.id = place.id");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                cheapTentList.add(resultSet.getString("place.name"));
            }

            resultSet.close();
            return cheapTentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getOpinionTent() {
        return null;
    }
}