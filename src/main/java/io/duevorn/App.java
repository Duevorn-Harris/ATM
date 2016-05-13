package io.duevorn;

/**
 * Created by duevornharris on 5/2/16.
 */
public class App {

    public static void main(String[] args) {
        Accounts account = new Accounts(AccountType.Checking, 4.7, OverDraftStatus.Enabled, "Duevorn Harris", 250.00);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountType());
        account.promptToEnterFunds();
        double balance = account.getBalance();
        System.out.println(account.depositFunds(balance));
    }
}
