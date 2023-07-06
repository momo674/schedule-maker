import java.util.Arrays;

public class Student {
    private ArraySchedule SCHEDULE;
    private String FIRST_NAME;
    private String LAST_NAME;
    private int ID;
    private String PROGRAM_TITLE;

    public Student(String fname, String lname, int id, String program){
        this.FIRST_NAME = fname;
        this.LAST_NAME = lname;
        this.ID = id;
        this.PROGRAM_TITLE = program;
        this.SCHEDULE = new ArraySchedule();
    }

    public void addCourse(Course c) {
        int id = c.getId();
        int day1 = c.getDay1();
        int day1_start = c.getDay1StartTime();
        int day1_end = c.getDay1EndTime();

        int day2 = c.getDay2();
        int day2_start = c.getDay2StartTime();
        int day2_end = c.getDay2EndTime();

        //adding day1 to schedule
        int i = day1_start;
        while (i < day1_end) {
            this.SCHEDULE.add(this.SCHEDULE.convertTimeToIndex(i), day1, id);
            i = i + 50;
        }

        i = day2_start;
        while (i < day2_end) {
            this.SCHEDULE.add(this.SCHEDULE.convertTimeToIndex(i), day2, id);
            i = i + 50;
        }
    }

    public String toString() {
       return Arrays.deepToString(this.SCHEDULE.getArray());
    }
}