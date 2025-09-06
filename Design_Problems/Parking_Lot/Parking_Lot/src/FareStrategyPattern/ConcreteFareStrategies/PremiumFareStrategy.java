package FareStrategyPattern.ConcreteFareStrategies;

import FareStrategyPattern.FareStrategy;

public class PremiumFareStrategy implements FareStrategy {

    @Override
    public int getFees(int hours, String vehicleType) {
        if(vehicleType=="car"){
            return hours*30;
        }
        else if(vehicleType=="bike"){
            return hours*5;
        }
        else{
            return 50*hours;
        }
    }
}
