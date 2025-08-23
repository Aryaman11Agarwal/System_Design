package TrafficLightStateManager;
import TrafficLightStateManager.Context.TrafficLightContext;

public interface TrafficLightState {

    public void next(TrafficLightContext trafficLightContext);
}
