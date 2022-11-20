public class SeniorOfficerAuthorization extends Authorization{

    public SeniorOfficerAuthorization(int amount) {
        this.amount = amount;
    }

    @Override
    protected void write() {
        System.out.println("Senior Officer Authorized.");
    }
}
