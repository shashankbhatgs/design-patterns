package patterns.behaviour.commandpattern;

public class RemoteControl {
    private Command onCommand;
    private Command volumeCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setVolumeCommand(Command volumenCommand) {
        this.volumeCommand = volumenCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
    }
}
