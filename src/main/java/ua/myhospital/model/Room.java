package ua.myhospital.model;


public class Room {

    private long number;
    private String type;
    private long blockFloor;
    private long blockCode;
    private long unavailable;


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public long getBlockFloor() {
        return blockFloor;
    }

    public void setBlockFloor(long blockFloor) {
        this.blockFloor = blockFloor;
    }


    public long getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(long blockCode) {
        this.blockCode = blockCode;
    }


    public long getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(long unavailable) {
        this.unavailable = unavailable;
    }

}
