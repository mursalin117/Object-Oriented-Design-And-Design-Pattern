public abstract class Authorization {
    public static int LEVEL1 = 10000;
    public static int LEVEL2 = 1000000;
    public static int LEVEL3 = LEVEL2+1;


    protected int amount;
    protected Authorization nextAuthorization;

    public void setNextAuthorization(Authorization nextAuthorization) {
        this.nextAuthorization = nextAuthorization;
    }

    public void logMessage(int amount) {
        if (amount <= this.amount && this.amount == LEVEL1) {
            write();
        } else if (this.amount < amount && this.amount == LEVEL1) {
            if (amount <= LEVEL2) {
                write();
            }
            nextAuthorization.logMessage(amount);
        } else if (this.amount == LEVEL2) {
            write();
            if (this.amount < amount) {
                nextAuthorization.logMessage(amount);
            }
        } else if (this.amount == LEVEL3) {
            write();
        }
    }

    abstract protected void write();
}
