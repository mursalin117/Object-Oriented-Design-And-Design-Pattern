public class SingletonObject { // lazy construction
    // the class variable is null if no instance is
    // instantiated
    private static SingletonObject uniqueInstance = null;

   private SingletonObject() {}

    // lazy construction of the instance
    public static SingletonObject getInstance() {
       if (uniqueInstance == null) {
           uniqueInstance = new SingletonObject();
       }
       return uniqueInstance;
    }

    public void showMessage() {
       System.out.println("This is singleton object.");
    }
}
