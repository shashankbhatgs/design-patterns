package patterns.creational.singleton;

//Singleton pattern
//public class Logger {
//    private static Logger instance = null;
//    private Logger(){}
//
//    public static synchronized Logger getInstance() {
//        if(instance == null) {
//            //concurrent threads might access at the same time. race condition. hence: synchronized keyword
//            instance = new Logger();
//        }
//        return instance;
//    }
//
//    public static void log(String message) {
//        System.out.println("[LOG]: " + message);
//    }
//
//}

public class Logger {
    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public static void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}