package pl.teamjava.hotel.models.dao;

import pl.teamjava.hotel.models.UserModel;

import java.util.List;

public interface ManagmentDao {
    List<String> showProperties(String accessCode);
    void addRoom (String accessCode);
    void deleteRoom (int id);
    void editRoom (int id);
    void addProperty (String accessCode);
    void deleteProperty (int id);
    void addToBlockedList (UserModel userModel);
    List<UserModel> showBlockedList (String accessCode);
    boolean isRoomBooked (int id, String nameOfProperty);
}
