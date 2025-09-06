package VehicleController;

public class VehicleFactory {



    public Vehicle getVehicle(String numberPlate,String vehicleType,FeeStrategy feeStrategy){
        return new Vehicle(numberPlate,vehicleType,feeStrategy);
    }
}
