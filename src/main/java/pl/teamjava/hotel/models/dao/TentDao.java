package pl.teamjava.hotel.models.dao;

import java.util.List;

public interface TentDao {
    List<String> getAllTentsNames();
    List<String> getTentsNames(String cityname); //lista pól namiotowych wg nazwy miasta
    List<String> getFreeTents(); //lista pól namiotowych wg wolnych miejsc na namiot
    List<String> getCheapTent(); //lista pól namiotowych wg ceny
    List<String> getOpinionTent(); //lista pól namiotowych wg oceny gości
}