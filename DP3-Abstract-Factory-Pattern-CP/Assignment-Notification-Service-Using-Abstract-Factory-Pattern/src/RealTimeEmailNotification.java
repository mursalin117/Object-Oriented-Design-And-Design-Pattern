public class RealTimeEmailNotification implements Notification {
    @Override
    public void notifyUser(String email) {
        System.out.println("Real time Email send to " + email);
    }
}
