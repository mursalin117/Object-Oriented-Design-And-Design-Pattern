public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String num) {
        System.out.println("SMS send to " + num);
    }
}
