import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student1;
    private Student student2;

    @Before
    public void setup(){
        this.student1 = new Student("Amber");
        this.student2 = new Student("Cami");
    }

    @Test
    public void testIfIdIsAccurate(){
        assertNotEquals(student1.getId(), student2.getId());
    }

    @Test
    public void
    testIfNameIsValid(){
        assertNotNull(student1.getName());
        assertNotEquals("", student1.getName());
    }

    @Test
    public void
    testToEnsureGradesAreBeingAdded(){
        assertEquals(0, student1.getGradesLength());
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        assertEquals(3, student1.getGradesLength());
    }

    @Test
    public void
    testToMakeSureAverageIsAccurate(){
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        double total = (90 + 100 + 100)/3;
        assertEquals(total, student1.getGradeAverage(),0);
    }

    @Test
    public void
    testToMakeSureReadResultsAreAccurate(){
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        int[] test = {90, 100, 100};
        Assert.assertArrayEquals(test, student1.readAllGrades());
    }

    @Test
    public void
    testForUpdate(){
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        int[] test = {90, 100, 100, 80, 100, 100};
        Assert.assertArrayEquals(test, student1.updateGrade(90, 80));
    }

    @Test
    public void
    testForRemovalOfGrade(){
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(90);
        int[] test = {90, 100, 90};
        Assert.assertArrayEquals(test, student1.deleteGrade(100));
    }


}
