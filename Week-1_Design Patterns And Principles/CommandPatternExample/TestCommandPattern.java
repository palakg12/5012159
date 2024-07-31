package CommandPatternExample;

// TestCommandPattern.java
public class TestCommandPattern {
    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light();

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remoteControl = new RemoteControl();

        // Turn on the light
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Turn off the light
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}

