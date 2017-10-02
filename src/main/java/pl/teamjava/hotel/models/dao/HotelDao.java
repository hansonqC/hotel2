package pl.teamjava.hotel.models.dao;

import pl.teamjava.hotel.models.PlaceModel;

import java.util.List;

public interface HotelDao {
    List<String> getAllHotelsNames();
    List<String> getHotelsNames(); //lista hoteli wg nazwy miasta
    List<String> getFreeHotels(); //lista hoteli wg wolnych miejsc na namiot
    List<String> getCheapApartment(); //lista hoteli wg ceny apartamentu
    List<String> getCheapRoom(); //lista hoteli wg ceny pokoju
    List<String> getOpinionHotel(); //lista hoteli wg oceny gości
    List<PlaceModel> gettAllHotelData(String hotelName);
    List<String> getAnimalsHotels();
    List<String> getWiFiHotels();
    List<String> getSpaHotels();
    List<String> getAquaparkHotels();
    List<String> getPoolHotels();
    String getCityName(String hotelName);
    String getRegionName(String hotelName);
}