public class RegularNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification(String notificationType) {
        if (notificationType == null) {
            return null;
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        }
        return null;
    }
}

