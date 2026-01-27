package src.main;

import java.util.ArrayList;

import src.main.FeatureEncapsulation.BankAccount;
import src.main.FeatureEncapsulation.Student;
import src.main.FeatureEncapsulation.Time;

public class FeaturesJApplication {
    public void display(Time t) {
        /*
        Chapter 2 Q3
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
        /*
        chapter 2 Q7
        Date d = new Date(1, 13, 2002);
        int xdate = d.day();
        int ydate = d.myYear();
         */
        // myYear() private, day is actually a method in the class
        // chapter 2 Q8 - in class can use vars, it's methods
        // this, in class prints current date object and to string will print it
        // chapter 2 Q11 - recentDate initialized as null and passed, method can
        // replace object reference
        // chapter 2 Q12 - reudce() method will be used only in implementation of 
        // instance emthods of the class so not public method
    }
    
}
