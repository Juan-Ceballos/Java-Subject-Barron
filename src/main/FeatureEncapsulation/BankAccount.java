package src.main.FeatureEncapsulation;

public class BankAccount {
    public double myBalance;
    public boolean pendingSuspension;
    
    public BankAccount() {
        myBalance = 0.0;
    }

    boolean checkSuspension() {
        if (myBalance < -50) {
            pendingSuspension = true;
        }
        return pendingSuspension;
    }    
}
