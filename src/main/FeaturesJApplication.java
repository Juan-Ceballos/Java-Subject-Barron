package src.main;

import java.util.ArrayList;

import src.main.FeatureEncapsulation.BankAccount;
import src.main.FeatureEncapsulation.Student;

public class FeaturesJApplication {
    public static void main(String[] args) {
        System.out.println("Hello");
        BankAccount juanBankAccount = new BankAccount();
        System.out.println(juanBankAccount.myBalance);
        ArrayList<Student> studentList = new ArrayList<Student>();
    }
    
}
