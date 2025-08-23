package TrafficLightStateManager.ConcreteStates;

import TrafficLightStateManager.Context.TrafficLightContext;
import TrafficLightStateManager.TrafficLightState;

public class YellowLightState implements TrafficLightState {

    private String color;
    public YellowLightState(){
        this.color="Yellow";
    }

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("Changing color from yellow to green");
        trafficLightContext.setCurrentState(new GreenLightState());
    }
}
