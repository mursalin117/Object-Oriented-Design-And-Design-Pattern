public class ManagerAuthorization extends Authorization{

    public ManagerAuthorization(int amount) {
        this.amount = amount;
    }

    @Override
    protected void write() {
        System.out.println("Manager Authorized.");
    }
}
