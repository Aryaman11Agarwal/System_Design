package ParkingLotController;

import PaymentStrategyDesign.ConcretePaymentClasses.Cash;
import PaymentStrategyDesign.ConcretePaymentClasses.CreditCard;
import PaymentStrategyDesign.PaymentStrategy;
import Utils.ParkingSpot;
import VehicleController.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Parking_Lot {

    private ArrayList<ParkingSpot> parkingSpots;
    private PaymentStrategy creditCard,cash;

    public Parking_Lot(){
        creditCard=new CreditCard();
        cash=new Cash();
        this.parkingSpots=new ArrayList<ParkingSpot>();

    }

    public void addParkingSpot(ParkingSpot spot){
        parkingSpots.add(spot);
    }

    public void park(Vehicle vehicle){

        ParkingSpot spot=getSpot(vehicle.getVehicleType());

        if(spot==null) return;

        bookSpot(spot,vehicle);
    }

    public ParkingSpot getSpot(String vehicleType){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(parkingSpot.isVacant() && parkingSpot.getVehicleType().equals(vehicleType)){

                System.out.println("Parking space found at spot no" + parkingSpot.getSpotNo());
                return parkingSpot;
            }


        }

        System.out.println("No vacant parking present at the moment");
        return null;
    }

    public boolean bookSpot(ParkingSpot spot, Vehicle vehicle){
       return spot.bookSpot(vehicle);
    }

    public void makePayment(Vehicle vehicle ,int hours){

        int fees=vehicle.getFareStrategy().getFees(hours, vehicle.getVehicleType());

        System.out.println("Your bill is $"+  fees);

        Scanner sc=new Scanner(System.in);

        System.out.println("Choose payment type");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");

        String payment=sc.nextLine();

        if(payment.equals("Credit Card")){
            creditCard.makePayment(fees);
        }
        else{
            cash.makePayment(fees);
        }
    }

    private ParkingSpot getParkingSpotWithThisVehicle(Vehicle vehicle){

        for(ParkingSpot parkingSpot:parkingSpots){
            if(!parkingSpot.isVacant() && parkingSpot.getVehicle().equals(vehicle)){
                return parkingSpot;
            }
        }

        return null;
    }

    public void exit(Vehicle vehicle ,int hours){

        ParkingSpot spot=getParkingSpotWithThisVehicle(vehicle);
        if(spot==null){
            System.out.println("This vehicle "+ vehicle.getNumberPlate()+ " is not present in parking");
            return;
        }

        System.out.println("THe vehicle "+vehicle.getNumberPlate()+" has exited");
        spot.checkout();

        makePayment(vehicle,hours);

    }



}
