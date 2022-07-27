package CriptoAnalizer.service;

import java.time.Instant;

public class Logger {

    private static Logger logger;
    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void info (String text) {
        System.out.println("\033[0;32m" + Instant.now() + ": " + text + "\033[0m");
    }

    public void error (String text) {
        System.out.println("\033[0;31m" + Instant.now() + ": " + text + "\033[0m");
    }
}
