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
        while (i <= day1_end) {
            if (this.SCHEDULE.attemptToAdd(this.SCHEDULE.convertTimeToIndex(i), day1, id)) {
                this.SCHEDULE.add(this.SCHEDULE.convertTimeToIndex(i), day1, id);
                i = i + 50;
            }
            else {
                System.out.println("Can't add class. Error");
                break;
            }
            
        }

        //adding day2 to schedule
        int j  = day2_start;
        while (j <= day2_end ) {
            if (this.SCHEDULE.attemptToAdd(this.SCHEDULE.convertTimeToIndex(j), day2, id)) {
                this.SCHEDULE.add(this.SCHEDULE.convertTimeToIndex(j), day2, id);
                j = j + 50;
            }
            else {
                System.out.println("Can't add class. Error");
                break;
            }
            
        }
    }

    public void removeCourse(Course c) {
        int id = c.getId();
        int day1 = c.getDay1();
        int day1_start = c.getDay1StartTime();
        int day1_end = c.getDay1EndTime();

        int day2 = c.getDay2();
        int day2_start = c.getDay2StartTime();
        int day2_end = c.getDay2EndTime();

        //adding day1 to schedule
        int i = day1_start;
        while (i <= day1_end) {
            if (this.SCHEDULE.attemptToRemove(this.SCHEDULE.convertTimeToIndex(i), day1, id)) {
                this.SCHEDULE.remove(this.SCHEDULE.convertTimeToIndex(i), day1, id);
                i = i + 50;
            }
            else {
                System.out.println("Can't remove class. Error");
                break;
            }
            
        }

        //adding day2 to schedule
        int j  = day2_start;
        while (j <= day2_end ) {
            if (this.SCHEDULE.attemptToRemove(this.SCHEDULE.convertTimeToIndex(j), day2, id)) {
                this.SCHEDULE.remove(this.SCHEDULE.convertTimeToIndex(j), day2, id);
                j = j + 50;
            }
            else {
                System.out.println("Can't remove class. Error");
                break;
            }
            
        }

        
    }

    public String toString() {
        String end = "";
        
        for (int i = 0; i < 48; i++) {
            int time = this.SCHEDULE.convertIndexToTime(i);
            end = end + Arrays.toString(this.SCHEDULE.getArray()[i]) + " " + time + "\n";
        }
        return end;
        
    }
}