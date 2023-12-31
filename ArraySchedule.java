import java.util.Arrays;

public class ArraySchedule {
    private int[][] sch;

    public ArraySchedule() {
        this.sch = new int[48][7];
    }

    public int convertTimeToIndex(int time) {
        //1350(1:00pm) -> 27
        int index = time/50;
        return index;
    }

    public int convertIndexToTime(int index) {
        //27 -> 1350(1:00pm)
        int time = index * 50;
        return time;
    }
    public boolean attemptToAdd(int i, int j, int value) {
        if (this.sch[i][j] == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void add(int i, int j, int value) {
       this.sch[i][j] = value;
        
    }
    public boolean attemptToRemove(int i, int j, int value) {
        if (this.sch[i][j] != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void remove(int i, int j, int value) {
       this.sch[i][j] = 0;
        
    }
    public int[][] getArray() {
        return this.sch;
    }

    public String toString(){
        return Arrays.deepToString(this.sch);
    }
}