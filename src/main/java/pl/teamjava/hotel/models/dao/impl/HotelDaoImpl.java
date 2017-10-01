package pl.teamjava.hotel.models.dao.impl;

import pl.teamjava.hotel.models.MySqlConnector;
import pl.teamjava.hotel.models.dao.HotelDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HotelDaoImpl implements HotelDao{

    MySqlConnector connector = MySqlConnector.getInstance();

    public List<String> getHotelsNames(){

        List<String> sortedCityList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT name FROM place WHERE category = ? ORDER BY city"
            );
            preparedStatement.setString(1,"Hotel");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                sortedCityList.add(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sortedCityList;
    }

    public List<String> getAllHotelsNames() {
        List<String> nameList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT DISTINCT name FROM place WHERE place.category = ?");
            preparedStatement.setString(1, "Hotel");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                nameList.add(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nameList;
    }

    public List<String> getFreeHotels() {
        List<String> sortedFreeList = new ArrayList<String>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT DISTINCT place.name FROM place INNER JOIN room ON room.hotel_id = place.id WHERE place.category = ? AND room.isBooked = ?" //
                    //jak posortować ilością wolnych miejsc, nie zlicza normalnie
            );

            preparedStatement.setString(1,"Hotel");
            preparedStatement.setInt(2,0);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                sortedFreeList.add(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sortedFreeList;
    }

    public List<String> getCheapApartment() {
        List<String> sortedCheapList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT DISTINCT place.name FROM place INNER JOIN room ON room.hotel_id = place.id WHERE place.category = ? AND kindOfRoom = ? ORDER BY room.price DESC"
            );

            preparedStatement.setString(1,"Hotel");
            preparedStatement.setString(2,"Apartament");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                sortedCheapList.add(resultSet.getString("place.name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sortedCheapList;
    }

    public List<String> getCheapRoom() {
        List<String> sortedCheapRoomList = new ArrayList<String>();
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT DISTINCT place.name FROM place INNER JOIN room ON room.hotel_id = place.id WHERE place.category = ? AND kindOfRoom NOT LIKE 'Apartament'"
            );

            preparedStatement.setString(1,"Hotel");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                sortedCheapRoomList.add(resultSet.getString("place.name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sortedCheapRoomList;
    }

    public List<String> getOpinionHotel() {
        return null;
    }
}