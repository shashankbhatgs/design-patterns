package patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class YoutubeChannelImplementation implements YoutubeChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String video;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber: subscribers) {
            subscriber.notify();
        }
    }
}
