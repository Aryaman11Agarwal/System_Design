public class TurnOffCommand implements Command{

    Light light;

    TurnOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.turnLightOff();
    }
}
