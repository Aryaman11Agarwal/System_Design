public class Main {
    public static void main(String[] args) {
        Light light=new Light();

        TurnOffCommand turnOffCommand=new TurnOffCommand(light);
        TurnOnCommand turnOnCommand=new TurnOnCommand(light);

        Remote remote=new Remote();

        remote.executeCommand(turnOnCommand);
        remote.executeCommand(turnOffCommand);
    }
}