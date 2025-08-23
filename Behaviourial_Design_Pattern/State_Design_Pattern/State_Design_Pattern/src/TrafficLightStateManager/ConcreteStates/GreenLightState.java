package TrafficLightStateManager.ConcreteStates;

import TrafficLightStateManager.Context.TrafficLightContext;
import TrafficLightStateManager.TrafficLightState;

public class GreenLightState implements TrafficLightState {

    private String color;
    public GreenLightState(){
        this.color="Green";
    }

    @Override
    public void next(TrafficLightContext trafficLightContext) {

        System.out.println("Changing color from green to red");
        trafficLightContext.setCurrentState(new RedLightState());

    }
}
