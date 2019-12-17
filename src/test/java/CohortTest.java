import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort1;
    private Cohort cohort2;
    private Cohort cohort3;


    @Before
    public void
    setup(){

        this.cohort1 = new Cohort(){{
            addStudent("Amber");
            addStudent("Cami");
            addStudent("Mason");
        }};
        //6
        cohort1.addGrade("Amber", 100);
        cohort1.addGrade("Amber", 100);
        cohort1.addGrade("Amber", 100);
        cohort1.addGrade("Mason", 100);
        cohort1.addGrade("Mason", 100);
        cohort1.addGrade("Cami", 100);




        this.cohort2 = new Cohort(){{
            addStudent("Nicole");
            addStudent("Michelle");
            addStudent("Charles");
        }};
        cohort2.addGrade("Nicole", 80);
        cohort2.addGrade("Nicole", 80);
        cohort2.addGrade("Nicole", 80);
        cohort2.addGrade("Michelle", 80);
        cohort2.addGrade("Michelle", 80);
        cohort2.addGrade("Charles", 80);

        this.cohort3 = new Cohort();
    }

    //z: end setup

    @Test
    public void
    testAddStudent(){
        assertEquals(3, cohort1.getStudents().size());
        assertEquals(3, cohort2.getStudents().size());
        assertEquals(0, cohort3.getStudents().size());
    }

    @Test
    public void
    testAverage(){

        assertEquals(100, cohort1.getCohortAverage(), 0);

        double average2 = (((80*3)/3) + ((80+80)/2) + 80) /3;
        assertEquals(average2, cohort2.getCohortAverage(), 0);

        assertEquals(0, cohort3.getCohortAverage(), 0);


    }



}
