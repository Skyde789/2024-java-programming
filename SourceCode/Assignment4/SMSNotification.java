package exercises;

public class SMSNotification extends Notification implements Sendable{
    
    public SMSNotification(String _rec, String _mes)
    {
        super(_rec, _mes);
        recipient = recipient.replace("0", "+358-");
    }

    @Override
    public String formatMessage(){
        return recipient + ": " + message;
    }

    @Override
    public String send(){
        return "Sent SMS " + recipient + ": " + message;
    }
}