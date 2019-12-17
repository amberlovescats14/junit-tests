import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Student implements I_Student{
    private Long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        Random id = new Random();
        this.id = id.nextLong();
        this.name = name;
    }
    //z: Change to primitive
    private int[] changeListToPrimitive(){
        int[] primitive = new int[grades.size()];
        for (int i = 0; i < grades.size(); i++) {
            primitive[i] = grades.get(i);
        }
        return primitive;
    }

    //z: get length of
    public int getGradesLength(){
        return grades.size();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public double getGradeAverage() {
        if(grades.size() == 0 ) return (double)0;
        long total = grades.stream().reduce(0,(a,b)-> a+b);
        return total / grades.size();
    }

    @Override
    public int[] readAllGrades() {
        int[] primitiveArr = changeListToPrimitive();
        return primitiveArr;
    }

    @Override
    public int[] updateGrade(int oldGrade, int newGrade) {
        if(grades.size() == 0 ) {
            System.out.println("No grades entered");
            return new int[0];
        }
        try {
        if(!grades.contains(oldGrade)) throw new Exception();

        int index = grades.lastIndexOf(oldGrade);
        grades.set(index, newGrade);
        } catch(Exception ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
        return changeListToPrimitive();
    }


    @Override
    public int[] deleteGrade(int grade) {
        if(grades.size() == 0 ) {
            System.out.println("No grades entered");
            return new int[0];
        }
        try {
            if(!grades.contains(grade)) throw new Exception();

            int index = grades.lastIndexOf(grade);
            grades.remove(index);
        } catch(Exception ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
        return changeListToPrimitive();
    }


}
