package patterns.structural.proxy;

public class ProxyVideoService implements VideoServiceInterface {
    private RealVideoService realVideoService;

    public ProxyVideoService(RealVideoService realVideoService) {
        this.realVideoService = realVideoService;
    }

    @Override
    public void playVideo(String userType, String videoName) {
        if (!userType.equals("premium") && videoName.startsWith("Premium")) {
            System.out.println("premium video requires a premium account");
        }

        // caching
        // rate limiting logic
    }
}
