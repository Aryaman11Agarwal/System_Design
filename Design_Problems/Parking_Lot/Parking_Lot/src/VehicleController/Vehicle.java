package VehicleController;

import FareStrategyPattern.FareStrategy;

public class Vehicle {

    private String numberPlate;
    private String vehicleType;

    private FareStrategy fareStrategy;

     Vehicle(String numberPlate, String vehicleType,FareStrategy feeStrategy){

        this.numberPlate=numberPlate;
        this.vehicleType=vehicleType;
        this.fareStrategy=feeStrategy;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public FareStrategy getFareStrategy() {
        return fareStrategy;
    }
}
