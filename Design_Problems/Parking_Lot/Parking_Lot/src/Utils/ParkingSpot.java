package Utils;

import javax.swing.tree.VariableHeightLayoutCache;


import VehicleController.Vehicle;

public class ParkingSpot {

    private Vehicle vehicle;
    private int SpotNo;
    private boolean isVacant;

    private String VehicleType;

    public ParkingSpot(int SpotNo,String VehicleType){
        this.SpotNo=SpotNo;
        this.VehicleType=VehicleType;
        this.isVacant=true;

    }

    public boolean bookSpot(Vehicle vehicle){
        if(!vehicle.getVehicleType().equals(this.VehicleType) || this.isVacant==false){
            return false;
        }

        this.vehicle=vehicle;
        this.isVacant=false;

        System.out.println("Parking vehicle "+vehicle.getNumberPlate()+ " at the spot" + SpotNo+"\n");

        return true;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public int getSpotNo() {
        return SpotNo;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void checkout(){

        System.out.println("Spot no "+SpotNo+" has been vacated \n");
        this.isVacant=true;
    }

}
