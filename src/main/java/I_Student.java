public interface I_Student {

    // returns the student's id
    public long getId();
    // returns the student's name
    public String getName();
    // adds the given grade to the grades list
    public void addGrade(int grade);
    // returns the average of the students grades
    public double getGradeAverage();
    //get all grades
    public int[] readAllGrades();
    //update
    public int[] updateGrade(int oldGrade, int newGrade);
    //delete
    public int[] deleteGrade(int grade);
}
