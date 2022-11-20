public class NotificationService {
    public static void main(String[] args) {
        //get notification factory
        NotificationFactory notificationFactory1 = FactoryProducer.createFactory("realtime");
        //get an object of realtime email
        Notification notification1 = notificationFactory1.createNotification("email");
        //call notify user method of email
        notification1.notifyUser("abc@email.com");
        //get an object of sms
        Notification notification2 = notificationFactory1.createNotification("sms");
        //call notify user method of sms
        notification2.notifyUser("123456");
        //get notification factory
        NotificationFactory notificationFactory2 = FactoryProducer.createFactory("regular");
        //get an object of email
        Notification notification3 = notificationFactory2.createNotification("EMAIL");
        //call notify user method of email
        notification3.notifyUser("abcd@email.com");
        //get an object of sms
        Notification notification4 = notificationFactory2.createNotification("SMS");
        //call notify user method of sms
        notification4.notifyUser("12345678");
    }
}
