package homework3_3_2;

import homework3_3_2.accounts.CheckingAccount;
import homework3_3_2.accounts.CreditAccount;
import homework3_3_2.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
//        savingsAccount.showValue();
//        creditAccount.showValue();
//        checkingAccount.showValue();
//        System.out.println(" ");
        savingsAccount.addMoney(100);
//        savingsAccount.showValue();
//        System.out.println(" ");
//        creditAccount.pay(500);
//        checkingAccount.pay(20);
//        System.out.println(" ");
        checkingAccount.addMoney(70);
//        System.out.println(" ");
//        creditAccount.addMoney(150);
        System.out.println("savingsAccount");
        savingsAccount.showValue();
        System.out.println("creditAccount");
        creditAccount.showValue();
        System.out.println("checkingAccount");
        checkingAccount.showValue();
        System.out.println(" ");
        checkingAccount.transfer(savingsAccount, 20);
        System.out.println(" ");
        savingsAccount.transfer(creditAccount, 20);
        System.out.println(" ");
        checkingAccount.showValue();
        savingsAccount.showValue();
        creditAccount.showValue();
        System.out.println(" ");
    }
}
