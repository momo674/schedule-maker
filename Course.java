public class Course{
    private String NAME; //"Mysteries of the mind"
    private int COURSE_ID;
    private int DAYNUM1; //Monday[0], Sunday[6]
    private int DAYNUM2; //Monday[0], Sunday[6]
    private int STARTDAY1; //12:01 am = 0001, 1:30pm = 1350
    private int ENDDAY1; //12:01 am = 0001, 1:30pm = 1350
    private int STARTDAY2; //12:01 am = 0001, 1:30pm = 1350
    private int ENDDAY2; //12:01 am = 0001, 1:30pm = 1350

    public Course (String name, int cid, int daynum1, int daynum2, int startday1, int endday1, int startday2, int endday2) {
        this.NAME = name;
        this.COURSE_ID = cid;
        this.DAYNUM1 = daynum1;
        this.DAYNUM2 = daynum2;
        this.STARTDAY1 = startday1;
        this.ENDDAY1 = endday1;
        this.STARTDAY2 = startday2;
        this.ENDDAY2 = endday2;

    }
    public String getName() { 
        return this.NAME; 
    }
    public int getId() { 
        return this.COURSE_ID; 
    }
    public int getDay1() {
        return this.DAYNUM1;
    }
    public int getDay2() {
        return this.DAYNUM2;
    }
    public int getDay1StartTime() {
        return this.STARTDAY1;
    }
    public int getDay1EndTime() {
        return this.ENDDAY1;
    }
    public int getDay2StartTime() {
        return this.STARTDAY2;
    }
    public int getDay2EndTime() {
        return this.ENDDAY2;
    }

}