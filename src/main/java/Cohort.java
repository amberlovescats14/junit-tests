import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private static long id = 0;
    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        if(students.size() == 0) return 0;
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(String name){
        students.add(new Student(name, id++));
    }

    public void addGrade(String name, int grade){
        for (Student student : students) {
            if(student.getName().equalsIgnoreCase(name))
                student.addGrade(grade);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}