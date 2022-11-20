public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingletonObject() is not visible
        // SingletonObject object = new SingletonObject();

        // get the only object available
        SingletonObject object = SingletonObject.getInstance();

        // show message
        object.showMessage();
    }
}