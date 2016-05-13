package io.duevorn;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by duevornharris on 5/2/16.
 */
public class Accounts {
    Scanner newScanner = new Scanner(System.in);
    Random randomNumber = new Random();
    int random = randomNumber.nextInt(Integer.MAX_VALUE) + 1;
    private final int accountNumber = random;
    private String accountHolder = "";
    private double balance = 0.0;
    private double interestRate = 0.0;
    private AccountStatuses accountStatuses;
    private final AccountType accountType;
    private OverDraftStatus overDraftStatus;
    private ArrayList<String> transactions = new ArrayList<String>();

    public Accounts( AccountType accountType, double interestRate, OverDraftStatus overDraftStatus, String accountHolder, double initialBalance) {
        this.accountType = accountType;
        int newAccountNumber = accountNumber;
        setAccountHolder(accountHolder);
        setOverDraftStatus(overDraftStatus);
        setInterestRate(interestRate);
        setBalance(initialBalance);
    }

    public String depositFunds(double balance) {
        String answer;
        if (balance == 0.0) {
            answer = "Please deposit funds!";
        } else {
            answer = "Your account is " + getBalance();
        }
        return answer;
    }

    public double promptToEnterFunds () {
        double balance;
        System.out.println("Please enter the amount of money you would like to deposit: ");
        balance = newScanner.nextDouble();
        setBalance(balance);
        System.out.println("You have successfully deposited funds");
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String withdrawFromAccount(double withdrawalAmount) {
        double withdraw = getBalance() - withdrawalAmount;
        System.out.println("You have debited " + withdrawalAmount + " from your account.");
        setBalance(withdraw);
        return newBalance();
    }

    public String newBalance() {
        return ("Your current balance is " + getBalance());
    }


    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setOverDraftStatus(OverDraftStatus overDraftStatus) {
        this.overDraftStatus = overDraftStatus;
    }
}

