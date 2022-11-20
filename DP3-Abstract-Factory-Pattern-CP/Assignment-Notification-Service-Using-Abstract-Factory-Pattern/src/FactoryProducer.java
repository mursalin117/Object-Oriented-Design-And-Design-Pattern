public class FactoryProducer {
    public static NotificationFactory createFactory(String factory) {
        if (factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("RealTime")) {
            return new RealTimeNotificationFactory();
        } else if (factory.equalsIgnoreCase("Regular")) {
            return new RegularNotificationFactory();
        }
        return null;
    }
}
