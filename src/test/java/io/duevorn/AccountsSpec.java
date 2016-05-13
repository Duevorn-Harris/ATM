package io.duevorn;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by duevornharris on 5/4/16.
 */
public class AccountsSpec {
    Accounts account;

    @Before
    public void accountsObjectInitializer () {
        account = new Accounts(AccountType.Checking, 4.7, OverDraftStatus.Enabled, "Duevorn", 250.00);
    }

    @Test
    public void depositFundsTest() {
        String expectedValue = "Please deposit funds!";
        String actualValue = account.depositFunds(0.0);
        assertEquals("The string messages do not match ", expectedValue, actualValue);
    }

    @Test
    public void promptToEnterFundsTest () {
        double expectedValue = 53.00;
        double actualValue = 53.00;
        assertEquals("The amount deposited does not equal the expected amount deposited ", expectedValue, actualValue, 0);
    }

    @Test
    public void getBalanceTest() {
        double expectedValue = 250.00;
        double actualValue = account.getBalance();
        assertEquals("The expected balance does not equal the actual balance ", expectedValue, actualValue, 0);
    }

    @Test
    public void withdrawFromAccountTest() {
        String expectedAmount = "Your current balance is " + 225.00;
        String actualAmount = account.withdrawFromAccount(25.00);
        assertEquals("The expected withdrawal amonut does not equal the actual amount withdrawn ", expectedAmount, actualAmount);
    }
}
