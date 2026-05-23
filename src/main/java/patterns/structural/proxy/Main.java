package patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        RealVideoService realVideoService = new RealVideoService();
        ProxyVideoService proxy = new ProxyVideoService(realVideoService);

        proxy.playVideo("free", "FRee video");

//        proxy.somefunction
    }
}
