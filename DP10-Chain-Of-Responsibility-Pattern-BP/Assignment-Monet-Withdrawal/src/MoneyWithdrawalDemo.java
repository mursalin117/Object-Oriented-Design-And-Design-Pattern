public class MoneyWithdrawalDemo {
    public static void main(String[] args) {

        Account account = new Account("abc", 1000000000);

        int amount = 1000;
        boolean flag = AuthorizationChain.checkAccount(account, amount);
        if (flag) {
            account.withdraw(amount);
        }
        System.out.println();

        amount = 100000;
        flag = AuthorizationChain.checkAccount(account, amount);
        if (flag) {
            account.withdraw(amount);
        }
        System.out.println();

        amount = 10000000;
        flag = AuthorizationChain.checkAccount(account, amount);
        if (flag) {
            account.withdraw(amount);
        }
        System.out.println();

        amount = 1000000000;
        flag = AuthorizationChain.checkAccount(account, amount);
        if (flag) {
            account.withdraw(amount);
        }
        System.out.println();
    }
}