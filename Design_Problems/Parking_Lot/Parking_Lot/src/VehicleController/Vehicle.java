package VehicleController;

public class Vehicle {

    private String numberPlate;
    private String vehicleType;

    private FeeStrategy feeStrategy;

     Vehicle(String numberPlate,String vehicleType,FeeStrategy feeStrategy){

        this.numberPlate=numberPlate;
        this.vehicleType=vehicleType;
        this.feeStrategy=feeStrategy;
    }

}
