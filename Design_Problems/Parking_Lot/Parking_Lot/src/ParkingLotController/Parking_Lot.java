package ParkingLotController;

import Utils.ParkingSpot;
import VehicleController.Vehicle;

import java.util.ArrayList;

public class Parking_Lot {

    private ArrayList<ParkingSpot> parkingSpots;

    void addParkingSpot(ParkingSpot spot){
        parkingSpots.add(spot);
    }

    public ParkingSpot getSpot(String vehicleType){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(parkingSpot.isVacant() && parkingSpot.getVehicleType().equals(vehicleType)){
                return parkingSpot;
            }


        }

        return null;
    }

    public boolean bookSpot(ParkingSpot spot, Vehicle vehicle){
       return spot.bookSpot(vehicle);
    }


}
