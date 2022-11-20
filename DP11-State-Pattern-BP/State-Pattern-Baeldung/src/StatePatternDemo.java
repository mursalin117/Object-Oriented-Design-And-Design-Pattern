public class StatePatternDemo {
    public static void main(String[] args) {

        Package pkg = new Package();
        pkg.printState();

        pkg.nextState();
        pkg.printState();

        pkg.nextState();
        pkg.printState();

        pkg.nextState();
        pkg.printState();
    }
}