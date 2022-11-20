public class PushNotification implements Notification{
    @Override
    public void notifyUser(String name) {
        System.out.println("Push Notification send to " + name);
    }
}
