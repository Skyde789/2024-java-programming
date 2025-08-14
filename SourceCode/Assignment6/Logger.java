package designpatterns;

public class Logger {
    private static Logger INSTANCE;

    public static Logger getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Logger();
        return INSTANCE;
    }

    String log(String message){
        return "Logger: " + message;
    }
}