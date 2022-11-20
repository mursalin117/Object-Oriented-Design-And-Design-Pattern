public class Package {

    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printState() {
        state.printStatus();
    }
}
