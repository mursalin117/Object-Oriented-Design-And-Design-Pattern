public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String email) {
        System.out.println("Email send to " + email);
    }
}
