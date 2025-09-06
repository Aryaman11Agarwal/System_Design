import FareStrategyPattern.ConcreteFareStrategies.BasicFareStrategy;
import FareStrategyPattern.ConcreteFareStrategies.PremiumFareStrategy;
import FareStrategyPattern.FareStrategy;
import ParkingLotController.Parking_Lot;
import Utils.ParkingSpot;
import VehicleController.Vehicle;
import VehicleController.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        Parking_Lot parkingLot=new Parking_Lot();

        VehicleFactory vehicleFactory=new VehicleFactory();
         FareStrategy basicFareStrategy=new BasicFareStrategy();
         FareStrategy premiumFarestrategy=new PremiumFareStrategy();

        Vehicle car1=vehicleFactory.getVehicle("1234","Car",basicFareStrategy);
        Vehicle car2=vehicleFactory.getVehicle("4567","Car",basicFareStrategy);
        Vehicle bike1=vehicleFactory.getVehicle("167876","Bike",basicFareStrategy);
        Vehicle bike2=vehicleFactory.getVehicle("7431","Bike",basicFareStrategy);

        parkingLot.addParkingSpot(new ParkingSpot(1,"Car"));
        parkingLot.addParkingSpot(new ParkingSpot(2,"Bike"));
        parkingLot.addParkingSpot(new ParkingSpot(3,"Car"));
        parkingLot.addParkingSpot(new ParkingSpot(4,"Car"));

        parkingLot.park(car1);
        parkingLot.park(bike1);


        parkingLot.exit(bike1,2);

        parkingLot.park(bike2);

        parkingLot.exit(car2,1);



    }
}