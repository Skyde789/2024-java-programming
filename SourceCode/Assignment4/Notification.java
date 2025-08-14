package exercises;

public abstract class Notification {
    protected String recipient, message;

    public Notification(String _rec, String _mes)
    {
        recipient = _rec;
        message = _mes;
    }

    public abstract String formatMessage();
}