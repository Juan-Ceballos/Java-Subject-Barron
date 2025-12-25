package src.main;

import src.main.FeatureEncapsulation.BankAccount;

public class FeaturesJApplication {
    public static void main(String[] args) {
        System.out.println("Hello");
        BankAccount juanBankAccount = new BankAccount();
        System.out.println(juanBankAccount.myBalance);
    }
    
}
