package module5;

import java.util.Date;

/**
 * Created by pan on 09.01.17.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        int roomCount = 0;
        Room[] result = new Room[5];
        int i = 0;
        while (i < result.length) {
            if (rooms[i].getPrice() == price)
                if (rooms[i].getCityName().equals(city))
                    if (rooms[i].getHotelName().equals(hotel)) {
                        result[roomCount] = rooms[i];
                        roomCount++;
                    }
            i++;
        }

        Room[] findRooms = new Room[roomCount];

        int j = 0;
        while (j < findRooms.length){
            findRooms[j] = result[j];
            j++;
        }

        return findRooms;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    public TripAdvisorAPI() {
            Room room1 = new Room(1,750,1,new Date(),"Philadelfia","Kiev");
            Room room2 = new Room(2,650,2,new Date(),"Philadelfia","Kiev");
            Room room3 = new Room(3,550,3,new Date(),"Philadelfia","Kiev");
            Room room4 = new Room(4,100,1,new Date(),"test","test");
            Room room5 = new Room(5,100,1,new Date(),"test","test");
            rooms[0] = room1;
            rooms[1] = room2;
            rooms[2] = room3;
            rooms[3] = room4;
            rooms[4] = room5;
    }
}
