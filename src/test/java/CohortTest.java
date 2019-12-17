import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort1;
    private Cohort cohort2;
    private Cohort cohort3;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;
    private Student student6;


    @Before
    public void
    setup(){
        this.student1 = new Student(1, "Amber"){{
            addGrade(100);
            addGrade(100);
            addGrade(100);
        }};
        this.student2 = new Student(1, "Cami"){{
            addGrade(100);
            addGrade(100);
            addGrade(100);
        }};
        this.student3 = new Student(1, "Mason"){{
            addGrade(100);
            addGrade(100);
            addGrade(100);
        }};
        this.cohort1 = new Cohort(){{
            addStudent(student1);
            addStudent(student2);
            addStudent(student3);
        }};

        var student4 = new Student(1, "Nicole"){{
            addGrade(80);
            addGrade(80);
            addGrade(80);
        }};
        var student5 = new Student(1, "Michelle"){{
            addGrade(80);
            addGrade(80);
            addGrade(80);
        }};
        var student6 = new Student(1, "Charles"){{
            addGrade(80);
            addGrade(80);
            addGrade(80);
        }};
        this.cohort2 = new Cohort(){{
            addStudent(student4);
            addStudent(student5);
            addStudent(student6);
        }};

        this.cohort3 = new Cohort();


    }

    @Test
    public void
    testAverage(){
        double average1 = (
                student1.getGradeAverage() +
                student2.getGradeAverage() +
                student3.getGradeAverage()
                )    /3;
        assertEquals(average1, cohort1.getCohortAverage(), 0);

        double average2 = (
                student3.getGradeAverage() +
                student4.getGradeAverage() +
                student5.getGradeAverage()
                ) / 3;
        assertEquals(average2, cohort2.getCohortAverage(), 0);


        assertEquals(0, cohort3.getCohortAverage(), 0);


    }

}
