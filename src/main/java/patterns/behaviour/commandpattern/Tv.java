package patterns.behaviour.commandpattern;

public class Tv {
    public Tv() {

    }

    public void turnOn(){
        System.out.println("TV turn on");
    }

    public void changeChannel(int channel) {
        System.out.println("changed to " + channel);
    }


}
