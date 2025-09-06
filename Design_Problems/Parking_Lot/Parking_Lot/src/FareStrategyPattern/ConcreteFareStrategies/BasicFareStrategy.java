package FareStrategyPattern.ConcreteFareStrategies;

import FareStrategyPattern.FareStrategy;

public class BasicFareStrategy implements FareStrategy {

    @Override
    public int getFees(int hours, String vehicleType) {
        if(vehicleType=="Car"){
            return hours*15;
        }
        else if(vehicleType=="Bike"){
            return hours*3;
        }
        else{
            return 20*hours;
        }
    }
}
