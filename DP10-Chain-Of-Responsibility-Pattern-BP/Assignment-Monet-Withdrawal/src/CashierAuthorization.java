public class CashierAuthorization extends Authorization{

    public CashierAuthorization(int amount) {
        this.amount = amount;
    }

    @Override
    protected void write() {
        System.out.println("Cashier Authorized.");
    }
}
