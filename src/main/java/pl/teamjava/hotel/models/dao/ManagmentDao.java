package pl.teamjava.hotel.models.dao;

import pl.teamjava.hotel.models.RoomModel;
import pl.teamjava.hotel.models.UserModel;

import java.util.List;

public interface ManagmentDao {
    List<String> showProperties(String accessCode);
    boolean addRoom (RoomModel model);
    boolean deleteRoom (String name);
    boolean editRoom (RoomModel model);
    boolean addProperty (String accessCode);
    boolean deleteProperty (String name);
    boolean addToBlockedList (UserModel userModel);
    List<UserModel> showBlockedList (String accessCode);
    boolean isRoomBooked (String name, String nameOfProperty);
}
