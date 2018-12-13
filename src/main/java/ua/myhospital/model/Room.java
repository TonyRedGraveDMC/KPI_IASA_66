package ua.myhospital.model;


public class Room {

    private long idRoom;
    private long roomNumber;
    private String type;
    private long numberOfSeats;

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + idRoom +
                ", roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    public Room(long roomNumber, String type, long numberOfSeats) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }


    public Room(long idRoom) {
        this.idRoom = idRoom;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(long idRoom) {
        this.idRoom = idRoom;
    }


    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


}
