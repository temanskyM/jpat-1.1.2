public class Logger {
    static private Logger logger;
    private int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if(logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
}
