package TrafficLightStateManager.ConcreteStates;

import TrafficLightStateManager.Context.TrafficLightContext;
import TrafficLightStateManager.TrafficLightState;

public class RedLightState implements TrafficLightState {

    private String color;
    public RedLightState(){
        this.color="Red";
    }

    public void next(TrafficLightContext trafficLightContext){
        System.out.println("Changing color from red to yellow");
        trafficLightContext.setCurrentState(new YellowLightState());
    }

}
