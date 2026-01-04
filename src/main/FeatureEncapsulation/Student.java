package src.main.FeatureEncapsulation;

public class Student {
    String name;
    int[] examScores = new int[4]; 
    double gpa;
    boolean isActive;
    
    public Student(String name, int age, int grade, int id) {
        
    }

    public Double calcAverage() {
        double average = 0;
        for (int score: examScores) {
            average += score;
        }
        return average / 2;
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

    public class GradStudent extends Student {
        public GradStudent(String name, int age, int grade, int id) {
            super(name, age, grade, id);
        }                        
    }

    public class HSStudent extends Student {
        public HSStudent(String name, int age, int grade, int id, int[] examScores) {
            super(name, age, grade, id);
        }

        public String greetStudent() {
            return("");
        }                        
    }
}


