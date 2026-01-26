package src.main;

import java.util.ArrayList;

import src.main.FeatureEncapsulation.BankAccount;
import src.main.FeatureEncapsulation.Student;
import src.main.FeatureEncapsulation.Time;

public class FeaturesJApplication {
    public void display(Time t) {
        /*
        Wrong Answer
        printing t.myHrs, etc.
        Time class has private fields, and a 
        to string method that allows printing of 
        class based on the format of method implementation
        */
        System.out.println(t);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        BankAccount juanBankAccount = new BankAccount();
        System.out.println(juanBankAccount.myBalance);
        ArrayList<Student> studentList = new ArrayList<Student>();

        
    }
    
}
