package src.main.FeatureEncapsulation;

public class Student {
    String name;
    int[] examScores = new int[1]; 
    double gpa;
    boolean isActive;

    public Student() {
        name = "";
        examScores = new int[0];
        isActive = false;
        gpa = 0.0;
    }

    public Student(String nameA, double gpaA, int[] examScoresA, boolean isActiveA) {
        name = nameA;
        gpa = gpaA;
        examScores = examScoresA;  
        isActive = isActiveA;                 
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

    public void printGrades() {
        int i = 0;
        while (i < examScores[i]) {
            System.out.println(examScores[i]);
        }
    }

    public double updateGrade(double value) {
        return gpa + value;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA() {
        gpa = 0;
    }

    public class GradStudent extends Student {
        public GradStudent() {
            super();
        }

        public GradStudent(String name, double gpa, int[] examScores, boolean isActive) {
            super(name, gpa, examScores, isActive);                      
        }
                              
    }

    public class HSStudent extends Student {
        public HSStudent(String name, int age, int grade, int id, int[] examScores) {
        
        }

        public String greetStudent() {
            return("");
        }                        
    }
}


