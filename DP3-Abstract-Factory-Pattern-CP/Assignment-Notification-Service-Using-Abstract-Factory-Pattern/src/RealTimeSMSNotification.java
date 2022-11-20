public class RealTimeSMSNotification implements Notification {
    @Override
    public void notifyUser(String num) {
        System.out.println("Real time sms send to " + num);
    }
}
