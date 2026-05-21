package patterns.creational.singleton;

public class Application {
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log("App started");
    }
}
