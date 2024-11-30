package com.parking.parkinglot.common;

public class CarDto {
    Long id;
    String licensePlate;
    String parkingSpot;
    String ownerName;

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public CarDto(Long id, String licensePlate, String ownerName, String parkingSpot) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }
}
