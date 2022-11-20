public class NotificationService {
    public static void main(String[] args) {
        // factory creation
        NotificationFactory notificationFactory = new NotificationFactory();

        // sms notification
        Notification sms = notificationFactory.createNotification("SMS");
        // call notifyUser method
        sms.notifyUser("0123456789");

        // email notification
        Notification email = notificationFactory.createNotification("EMAIL");
        // call notifyUser method
        email.notifyUser("abc@email.com");

        // push notification
        Notification push = notificationFactory.createNotification("Push");
        // call notifyUser method
        push.notifyUser("ABC");
    }
}
