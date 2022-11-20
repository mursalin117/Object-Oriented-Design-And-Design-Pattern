public class SingletonPatternDemo {
    public static void main(String[] args) {
        // get only object available
        SingletonObject object = SingletonObject.getInstance();

        // show the message
        object.showMessage();
    }
}