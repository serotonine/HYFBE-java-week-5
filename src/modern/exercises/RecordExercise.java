package modern.exercises;

import java.util.ArrayList;
import java.util.List;

public class RecordExercise {
   public  static void main(String[] args) {
        try{
            List<Student> students = new ArrayList<>(List.of(
                    new Student(1, "Robert", 5d),
                    new Student(2, "Preeti", 15d),
                    new Student(3, "John", 17d),
                    new Student(4, "Alison", 12d),
                    new Student(5, "Catherine", 19d),
                    new Student(6, "Gomathi", 7d),
                    new Student(7, "Helena", 0d),
                    new Student(8, "Basel", 14d),
                    new Student(9, "Julie", 16d)
            ));
            System.out.printf("Average grade: %.2f %n",averageGrade(students));
            System.out.println("Students List");
            print(students);
            System.out.println("Best student:\n" + bestStudent(students).toString());
            // Curve
            Student helena = students.get(6);
            students.set(6, helena.curve(12d));
            System.out.println(students.get(6).toString());


        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    // Methods.
    public static double averageGrade(List<Student> students){
        double grades = 0d;
        for(Student student:students){
           grades += student.grade();
        }
        return grades / students.size();
    }

    public static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println("- " + student);
        }
    }
    public static Student bestStudent(List<Student> students){
        double max = students.get(0).grade();
        Student best = students.get(0);
        for (Student student : students) {
            if(student.grade() > max){
                max = student.grade();
                best = student;
            }
        }
        return best;
    }
}
record Student(int id, String name, double grade){
    public Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(id + " Student name must be filled");
        }
        if (grade < 0d || grade > 20d) {
            throw new IllegalArgumentException(name + "'s grade must be in beetween 0,00 and 20,00");
        }
    }
    public boolean hasPassed(){
        return grade >= 10d;
    }
    public String gradeMention(){
        if (grade >= 16){ return "Excellent"; }
        else if(grade >= 14){
            return "Very Good";
        }
        else if(grade >= 12){
            return "Good";
        }
        else if(grade >= 10){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return name() + " grade: " + grade() + " mention: " + gradeMention();
    }
    public Student curve(double points){
        double increase = grade() + points;
        double bonus = increase <= 20 ? increase : 20;
        return new Student(id(), name(), bonus );
    }
}
