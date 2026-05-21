package patterns.behaviour.observer;

public class DesktopSubscriber implements Subscriber {

    @Override
    public void notify(String video) {
        System.out.println("Some logic");
    }
}
