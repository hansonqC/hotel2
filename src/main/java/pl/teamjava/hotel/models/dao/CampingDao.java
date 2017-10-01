package pl.teamjava.hotel.models.dao;

import java.util.List;

public interface CampingDao {
    List<String> getAllCampingNames();
    List<String> getCampingsNames(String cityname); //lista domków kampingowych wg nazwy miasta
    List<String> getFreeCampings(); //lista domków kampingowych wg wolnych miejsc na namiot
    List<String> getCheapCamping(); //lista domków kampingowych wg ceny
    List<String> getOpinionHotel(); //lista domków kampingowych wg oceny gości
}