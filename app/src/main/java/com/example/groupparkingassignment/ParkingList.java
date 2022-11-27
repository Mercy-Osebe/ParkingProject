package com.example.groupparkingassignment;

public class ParkingList {
    private String parkingNumber;
    private String parkingArea;
    private String parkingLocation;

    public ParkingList(String parkingNumber, String parkingArea, String parkingLocation) {
        this.parkingNumber = parkingNumber;
        this.parkingArea = parkingArea;
        this.parkingLocation = parkingLocation;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public void setParkingArea(String parkingArea) {
        this.parkingArea = parkingArea;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public String getParkingNumber() {
        return parkingNumber;
    }

    public String getParkingArea() {
        return parkingArea;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }
}
