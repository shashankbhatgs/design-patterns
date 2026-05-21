package patterns.behaviour.observer;

public class YoutubeSubscriber implements Subscriber {
    private String email;
    public YoutubeSubscriber(String email){
        this.email = email;
    }
    @Override
    public void notify(String video) {
        System.out.println("some logic to notify YouTube Subscriber");
    }
}
