package exercises;

public class EmailNotification extends Notification implements Sendable {
    public EmailNotification(String _rec, String _mes)
    {
        super(_rec,_mes);

    }

    @Override
    public String formatMessage(){
        return recipient+ ": " + message;
    }

    @Override
    public String send(){
        return "Sent email " + recipient + ": " + message;
    }
}