public class AuthorizationChain {

    public static Authorization getChainOfAuthorization() {
        Authorization cashier = new CashierAuthorization(Authorization.LEVEL1);
        Authorization seniorOfficer = new SeniorOfficerAuthorization(Authorization.LEVEL2);
        Authorization manager = new ManagerAuthorization(Authorization.LEVEL3);

        cashier.setNextAuthorization(seniorOfficer);
        seniorOfficer.setNextAuthorization(manager);

        return cashier;
    }

    public static boolean checkAccount(Account account, int amount) {

        Authorization authorization = getChainOfAuthorization();
        if (account.balance >= amount) {
            authorization.logMessage(amount);
            return true;
        }
        System.out.println("Not enough money");
        return false;
    }
}
