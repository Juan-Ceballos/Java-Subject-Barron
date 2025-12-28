package src.main.FeatureEncapsulation;

public class Student {
    String name;
    
    public Student(String name, int age, int grade, int id) {
        
    }

    public String getName() {
        return name;        
    }

    public String greetStudent(String name) {
        return name;
    }

    public String greetStudent(String name, int age) {
        return("");
    }
}
