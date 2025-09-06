package VehicleController;

import FareStrategyPattern.FareStrategy;

public class VehicleFactory {



    public Vehicle getVehicle(String numberPlate, String vehicleType, FareStrategy fareStrategy){
        return new Vehicle(numberPlate,vehicleType,fareStrategy);
    }
}
