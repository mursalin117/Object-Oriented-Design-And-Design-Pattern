public class RealTimeNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification (String notificationType) {
        if (notificationType == null) {
            return null;
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            return new RealTimeSMSNotification();
        } else if (notificationType.equalsIgnoreCase("Email")) {
            return new RealTimeEmailNotification();
        }
        return null;
    }
}
