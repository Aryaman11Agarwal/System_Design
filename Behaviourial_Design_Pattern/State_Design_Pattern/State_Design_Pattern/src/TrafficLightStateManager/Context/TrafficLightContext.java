package TrafficLightStateManager.Context;

import TrafficLightStateManager.ConcreteStates.RedLightState;
import TrafficLightStateManager.TrafficLightState;

public class TrafficLightContext {

     TrafficLightState currentState;

     public TrafficLightContext(){
         currentState=new RedLightState();
     }

     public void setCurrentState(TrafficLightState state){
         currentState=state;
     }

     public void next(){
         currentState.next(this);
     }

}
